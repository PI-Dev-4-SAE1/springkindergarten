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
import tn.esprit.spring.springbootforkindergarten.entity.User;
import tn.esprit.spring.springbootforkindergarten.service.IuserService;



@RestController
public class UserRest {

	@Autowired 
	 IuserService userService; 
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-User
	 @GetMapping("/retrieve-all-User") 
	 @ResponseBody 
	 public List<User> getUser() { 
		 List<User> list = userService.retrieveAllUser(); 
		 return list; } 
	//http://localhost:8081/SpringMVC/servlet/retrieve-User/{User-id} 
	 @GetMapping("/retrieve-User/{User-id}") 
	 @ResponseBody 
	 public User retrieveUser(@PathVariable("User-id") int UserId) { 
		 return userService.retrieveUser(UserId);  } 
	// Ajouter Activity : http://localhost:8081/SpringMVC/servlet/add-User 
	 @PostMapping("/add-User") 
	 @ResponseBody 
	 public User addUser(@RequestBody User u) { 
		 User User = userService.addUser(u); 
		 return User ; }
	//http://localhost:8081/SpringMVC/servlet/remove-User/{User-id} 
	 @DeleteMapping("/remove-User/{User-id}") 
	 @ResponseBody 
	 public void removeUser(@PathVariable("User-id") String UserId) {
		 userService.deleteUser(UserId); 
		  } 
	 // http://localhost:8081/SpringMVC/servlet/modifyUser 
	 @PutMapping("/modifyUser") 
	 @ResponseBody 
	 public User modifyUser(@RequestBody User User) { 
		 return userService.updateUser(User);  }
}
