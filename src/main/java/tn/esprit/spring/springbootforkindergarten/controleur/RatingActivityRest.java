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


import tn.esprit.spring.springbootforkindergarten.entity.RatingActivity;
import tn.esprit.spring.springbootforkindergarten.service.IactivityService;
import tn.esprit.spring.springbootforkindergarten.service.iRatingActivityService;

@RestController
public class RatingActivityRest {
	@Autowired 
	 iRatingActivityService RatingActivityService; 
	@Autowired 
	IactivityService ActivityService ;
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-RatingActivity 
		 @GetMapping("/retrieve-all-RatingActivity") 
		 @ResponseBody 
		 public List<RatingActivity> getRatingActivity() { 
			 List<RatingActivity> list = RatingActivityService.retrieveAllRatingActivity(); 
			 return list; } 
		//http://localhost:8081/SpringMVC/servlet/retrieve-RatingActivity/{RatingActivity-id} 
		 @GetMapping("/retrieve-RatingActivity/{RatingActivity-id}") 
		 @ResponseBody 
		 public RatingActivity retrieveRatingActivity(@PathVariable("RatingActivity-id") int RatingActivityId) { 
			 return RatingActivityService.retrieveRatingActivity(RatingActivityId);  } 
		// Ajouter RatingActivity : http://localhost:8081/SpringMVC/servlet/add-RatingActivity 
	 @PostMapping("/add-RatingActivity/{Activity-id}") 
		 @ResponseBody 
		 public RatingActivity addRatingActivity(@RequestBody RatingActivity ra, @PathVariable("Activity-id") int ActivityId) { 
			 ra.setActivity(ActivityService.retrieveActivity(ActivityId));
			 RatingActivity RatingActivity = RatingActivityService.addRatingActivity(ra ); 
			 

			 return RatingActivity ; }
		//http://localhost:8081/SpringMVC/servlet/remove-RatingActivity/{RatingActivity-id} 
		 @DeleteMapping("/remove-RatingActivity/{RatingActivity-id}") 
		 @ResponseBody 
		 public void removeRatingActivity(@PathVariable("RatingActivity-id") String RatingActivityId) {
			 RatingActivityService.deleteRatingActivity(RatingActivityId); 
			  } 
		 // http://localhost:8081/SpringMVC/servlet/modify-RatingActivity 
		 @PutMapping("/modify-RatingActivity/{RatingActivity-id}/{Activity-id}") 
		 @ResponseBody 
		 public RatingActivity modifyRatingActivity(@RequestBody RatingActivity RatingActivity,@PathVariable("Activity-id") int ActivityId ,@PathVariable("RatingActivity-id") int RatingActivityId) {
			 RatingActivity.setActivity(ActivityService.retrieveActivity(ActivityId));
			 RatingActivity.setId(RatingActivityId);
			 return RatingActivityService.updateRatingActivity(RatingActivity);  }
}
