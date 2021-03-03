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

import tn.esprit.spring.springbootforkindergarten.entity.Feedback;
import tn.esprit.spring.springbootforkindergarten.service.IfeedbackService;

@RestController
public class FeedbackRest {
	@Autowired 
	 IfeedbackService FeedbackService; 
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Feedback 
	 @GetMapping("/retrieve-all-Feedback") 
	 @ResponseBody 
	 public List<Feedback> getFeedback() { 
		 List<Feedback> list = FeedbackService.retrieveAllFeedback(); 
		 return list; } 
	//http://localhost:8081/SpringMVC/servlet/retrieve-Feedback/{Feedback-id} 
	 @GetMapping("/retrieve-Feedback/{Feedback-id}") 
	 @ResponseBody 
	 public Feedback retrieveFeedback(@PathVariable("Feedback-id") int FeedbackId) { 
		 return FeedbackService.retrieveFeedback(FeedbackId);  } 
	// Ajouter Feedback : http://localhost:8081/SpringMVC/servlet/add-Feedback 
	 @PostMapping("/add-Feedback") 
	 @ResponseBody 
	 public Feedback addFeedback(@RequestBody Feedback f) { 
		 Feedback Feedback = FeedbackService.addFeedback(f); 
		 return Feedback; }
	//http://localhost:8081/SpringMVC/servlet/remove-Feedback/{Feedback-id} 
	 @DeleteMapping("/remove-Feedback/{Feedback-id}") 
	 @ResponseBody 
	 public void removeFeedback(@PathVariable("Feedback-id") String FeedbackId) {
		 FeedbackService.deleteFeedback(FeedbackId); 
		  } 
	 // http://localhost:8081/SpringMVC/servlet/modify-Feedback
	 @PutMapping("/modify-Feedback") 
	 @ResponseBody 
	 public Feedback modifyFeedback(@RequestBody Feedback Feedback) { 
		 return FeedbackService.updateFeedback(Feedback);  }
}
