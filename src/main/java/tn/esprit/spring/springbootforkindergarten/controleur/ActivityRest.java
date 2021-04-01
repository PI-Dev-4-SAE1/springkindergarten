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

import tn.esprit.spring.springbootforkindergarten.entity.Activity;
import tn.esprit.spring.springbootforkindergarten.service.IactivityService;



@RestController
public class ActivityRest {

	@Autowired 
	 IactivityService ActivityService; 
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Activity 
	 @GetMapping("/retrieve-all-Activity") 
	 @ResponseBody 
	 public List<Activity> getActivity() { 
		 List<Activity> list = ActivityService.retrieveAllActivity(); 
		 return list; } 
	 
	 
	 
	//http://localhost:8081/SpringMVC/servlet/retrieve-Activity/{Activity-id} 
	 @GetMapping("/retrieve-Activity/{Activity-id}") 
	 @ResponseBody 
	 public Activity retrieveActivity(@PathVariable("Activity-id") int ActivityId) { 
		 return ActivityService.retrieveActivity(ActivityId);  } 
	 
	 
	 
	// Ajouter Activity : http://localhost:8081/SpringMVC/servlet/add-Activity 
	 @PostMapping("/add-Activity") 
	 @ResponseBody 
	 public Activity addActivity(@RequestBody Activity a) { 
		 Activity Activity = ActivityService.addActivity(a); 
		 return Activity ; }
	 
	 
	 
	//http://localhost:8081/SpringMVC/servlet/remove-Activity/{Activity-id} 
	 @DeleteMapping("/remove-Activity/{Activity-id}") 
	 @ResponseBody 
	 public void removeActivity(@PathVariable("Activity-id") String ActivityId) {
		 ActivityService.deleteActivity(ActivityId); 
		  } 
	 
	 
	 // http://localhost:8081/SpringMVC/servlet/modify-Activity 
	 @PutMapping("/modify-Activity") 
	 @ResponseBody 
	 public Activity modifyActivity(@RequestBody Activity Activity) { 
		 return ActivityService.updateActivity(Activity);  }
}
