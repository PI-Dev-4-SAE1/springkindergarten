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


import tn.esprit.spring.springbootforkindergarten.entity.ReclamationActivity;
import tn.esprit.spring.springbootforkindergarten.service.IReclamationActivityService;
import tn.esprit.spring.springbootforkindergarten.service.IactivityService;


@RestController
public class ReclamationActivityRest {
	@Autowired 
	 IReclamationActivityService ReclamationActivityService; 
	@Autowired 
	IactivityService ActivityService ;
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-ReclamationActivity 
		 @GetMapping("/retrieve-all-ReclamationActivity") 
		 @ResponseBody 
		 public List<ReclamationActivity> getReclamationActivity() { 
			 List<ReclamationActivity> list = ReclamationActivityService.retrieveAllReclamationActivity(); 
			 return list; } 
		//http://localhost:8081/SpringMVC/servlet/retrieve-ReclamationActivity/{ReclamationActivity-id} 
		 @GetMapping("/retrieve-ReclamationActivity/{ReclamationActivity-id}") 
		 @ResponseBody 
		 public ReclamationActivity retrieveReclamationActivity(@PathVariable("ReclamationActivity-id") int ReclamationActivityId) { 
			 return ReclamationActivityService.retrieveReclamationActivity(ReclamationActivityId);  } 
		// Ajouter ReclamationActivity : http://localhost:8081/SpringMVC/servlet/add-ReclamationActivity 
		 @PostMapping("/add-ReclamationActivity/{Activity-id}") 
		 @ResponseBody 
		 public ReclamationActivity addReclamationActivity(@RequestBody ReclamationActivity rea , @PathVariable("Activity-id") int ActivityId) { 
			

			 rea.setActivity(ActivityService.retrieveActivity(ActivityId));
			 ReclamationActivity ReclamationActivity = ReclamationActivityService.addReclamationActivity(rea); 
			 return ReclamationActivity ; }
		//http://localhost:8081/SpringMVC/servlet/remove-ReclamationActivity/{ReclamationActivity-id} 
		 @DeleteMapping("/remove-ReclamationActivity/{ReclamationActivity-id}") 
		 @ResponseBody 
		 public void removeReclamationActivity(@PathVariable("ReclamationActivity-id") String ReclamationActivityId) {
			 ReclamationActivityService.deleteReclamationActivity(ReclamationActivityId); 
			  } 
		 // http://localhost:8081/SpringMVC/servlet/modify-ReclamationActivity 
		 @PutMapping("/modify-ReclamationActivity/{ReclamationActivity-id}/{Activity-id}") 
		 @ResponseBody 
		 public ReclamationActivity modifyReclamationActivity(@RequestBody ReclamationActivity ReclamationActivity ,@PathVariable("ReclamationActivity-id") int ReclamationActivityId,  @PathVariable("Activity-id") int ActivityId) { 
			 ReclamationActivity.setActivity(ActivityService.retrieveActivity(ActivityId));
			 ReclamationActivity.setId(ReclamationActivityId);
			 return ReclamationActivityService.updateReclamationActivity(ReclamationActivity);  }
}
