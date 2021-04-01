package tn.esprit.spring.springbootforkindergarten.controleur;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.springbootforkindergarten.entity.Comments;
import tn.esprit.spring.springbootforkindergarten.entity.User;
import tn.esprit.spring.springbootforkindergarten.exception.ResourceNotFoundException;
import tn.esprit.spring.springbootforkindergarten.repository.CommentsRepository;
import tn.esprit.spring.springbootforkindergarten.repository.PostsRepository;
import tn.esprit.spring.springbootforkindergarten.repository.userRepository;



@RestController
public class CommentController {

    @Autowired
    private CommentsRepository commentRepository;

    @Autowired
    private PostsRepository postRepository;


	@Autowired
    private userRepository userRepository;
	
    @GetMapping("/posts/{posts_id}/comments")
    public Page<Comments> getAllCommentsByPostId(@PathVariable (value = "posts_id") Long postId,
                                                Pageable pageable) {
        return commentRepository.findByPostsId(postId, pageable);
    }

    @PostMapping("creatComment/{User-id}/posts/{posts_id}/comments")
    public Comments createComment(@PathVariable (value = "User-id") int UserId,@PathVariable (value = "posts_id") Long posts_id, @RequestBody Comments comment) {
    	 return userRepository.findById(UserId).map(user -> {
             comment.setUser(user);
   
    	return postRepository.findById(posts_id).map(posts -> {
    		
            comment.setPosts(posts);
            if (comment.getText().equals("FUCK"))
            {
            	comment.setText("F***");
            }
            return commentRepository.save(comment);
    	}).orElseThrow(() -> new ResourceNotFoundException("UserId " + UserId + " not found"));
    	}).orElseThrow(() -> new ResourceNotFoundException("posts_id " + posts_id + " not found"));
    }

	@PutMapping("update/{User-id}/posts/{posts_id}/comments/{commentId}")
    public Comments updateComment(@PathVariable (value = "User-id") int UserId,@PathVariable (value = "posts_id") Long posts_id,
                                 @PathVariable (value = "commentId") Long commentId,
                                  @RequestBody Comments commentRequest) {
		
			
        if(!postRepository.existsById(posts_id)) {
            throw new ResourceNotFoundException("PostId " + posts_id + " not found");
        }
        if(!userRepository.existsById(UserId)) {
            throw new ResourceNotFoundException("UserId " + UserId + " not found");
        }

        return commentRepository.findByIdAndPostsId(commentId, posts_id).map(comment -> {
        	 int user=comment.getUser().getId();
   		     if(user == UserId)  
   		     {
            comment.setText(commentRequest.getText());
   		     }
   		  return commentRepository.save(comment);
      
        }).orElseThrow(() -> new ResourceNotFoundException("CommentId " + commentId + "not found"));
    }

    @DeleteMapping("delete/{User-id}/posts/{posts_id}/comments/{commentId}")
    public ResponseEntity<?> deleteComment(@PathVariable (value = "User-id") int UserId,@PathVariable (value = "posts_id") Long posts_id,
                              @PathVariable (value = "commentId") Long commentId) {
    
    if(!userRepository.existsById(UserId)) {
        throw new ResourceNotFoundException("UserId " + UserId + " not found");
    }
        return commentRepository.findByIdAndPostsId(commentId, posts_id).map(comment -> {
        	 int user=comment.getUser().getId();
   		     if(user == UserId)
   		     {
            commentRepository.delete(comment);
   		     }
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Comment not found with id " + commentId + " and postId " + posts_id));
    }
}