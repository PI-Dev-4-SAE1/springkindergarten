package tn.esprit.spring.springbootforkindergarten.controleur;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.springbootforkindergarten.entity.Posts;
import tn.esprit.spring.springbootforkindergarten.exception.ResourceNotFoundException;
import tn.esprit.spring.springbootforkindergarten.repository.userRepository;
import tn.esprit.spring.springbootforkindergarten.repository.PostsRepository;


@RestController
public class PostController {

	@Autowired
    private userRepository userRepository;
	
    @Autowired
    private PostsRepository postRepository;
    private static final Logger l = LogManager.getLogger(PostController.class);
    @GetMapping("/posts")
    public Page<Posts> getAllPosts(Pageable pageable) {
        return postRepository.findAll(pageable);
    }
    
    @GetMapping("/user/{User-id}/posts")
    public Page<Posts> getAllPostsByUserId(@PathVariable (value = "User-id") int UserId,Pageable pageable) {
        return postRepository.findByUserId(UserId,pageable);
    }

    @PostMapping("/user/{User-id}/posts")
    public Posts createPost(@PathVariable (value = "User-id") int UserId, @RequestBody Posts post) {
    	 return userRepository.findById(UserId).map(user -> {
             post.setUser(user);
        return postRepository.save(post);
    	 }).orElseThrow(() -> new ResourceNotFoundException("UserId " + UserId + " not found"));
    }
  

    @PutMapping("/updatepost/{User-id}/posts/{postId}")
    public Posts updatePost(@PathVariable (value = "User-id") int UserId,@PathVariable (value = "postId") Long postId,@RequestBody Posts postRequest) {
    	  if(!userRepository.existsById(UserId)) {
              throw new ResourceNotFoundException("UserId " + UserId + " not found");
          }
    	  return postRepository.findById(postId).map(post -> {
    		  int user=post.getUser().getId();
    		  if(user == UserId)
    		  {
            post.setTitle(postRequest.getTitle());
            post.setDescription(postRequest.getDescription());
            post.setContent(postRequest.getContent());
    		  }else
    		  {
    			  l.info("hhhhhhhhhhhhhhhhhhhh",post.getUser().getNom());
    		  }
            return postRepository.save(post);
            }).orElseThrow(() -> new ResourceNotFoundException("UserId  " + UserId + " not found"));
    }


    @DeleteMapping("/deletepost/{User-id}/posts/{postId}")
    public ResponseEntity<?> deletePost(@PathVariable (value = "User-id") int UserId, @PathVariable (value = "postId") Long postId) {
    	 return postRepository.findByIdAndUserId(postId,UserId ).map(post -> {
    		 int user=post.getUser().getId();
   		  if(user == UserId)
   		  {
            postRepository.delete(post);
   		  }else
   		  {
   			 l.info("hhhhhhhhhhhhhhhhhhhhh",post.getUser().getNom());
   		  }
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
    }
    

}