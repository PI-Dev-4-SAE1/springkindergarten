package tn.esprit.spring.springbootforkindergarten.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootforkindergarten.entity.Posts;
import tn.esprit.spring.springbootforkindergarten.service.IPostsService;




@RestController
public class PostsRest {

	@Autowired 
	 IPostsService PostsService; 
	 // http://localhost:8081/Spring/MVC/retrieve-all-Posts 
	 @GetMapping("/retrieve-all-Posts") 
	 @ResponseBody 
	 public List<Posts> getPosts() { 
		 List<Posts> list = PostsService.retrieveAllPosts(); 
		 return list; } 
	//http://localhost:8081/Spring/MVC/retrieve-Posts/{Posts-id} 
	 @GetMapping("/retrieve-Posts/{Posts-id}") 
	 @ResponseBody 
	 public Posts retrievePosts(@PathVariable("Posts-id") int PostsId) { 
		 return PostsService.retrievePosts(PostsId);  } 
	// Ajouter Posts : http://localhost:8081/Spring/MVC/add-Posts
	 @PostMapping("/add-Posts") 
	 @ResponseBody 
	 public Posts addPosts(@RequestBody Posts Po) { 
		 Posts Posts = PostsService.addPosts(Po); 
		 return Posts ; }
	//http://localhost:8081/Spring/MVC/remove-Posts/{Posts-id} 
	 @DeleteMapping("/remove-Posts/{Posts-id}") 
	 @ResponseBody 
	 public void removePosts(@PathVariable("Posts-id") String PostsId) {
		 PostsService.deletePosts(PostsId); 
		  } 
	 // http://localhost:8081/Spring/MVC/modify-Posts 
	 @PutMapping("/modify-Posts") 
	 @ResponseBody 
	 public Posts modifyActivity(@RequestBody Posts Posts) { 
		 return PostsService.updatePosts(Posts);  }
}
