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
import tn.esprit.spring.springbootforkindergarten.entity.Matching;
import tn.esprit.spring.springbootforkindergarten.service.IMatchingService;
import tn.esprit.spring.springbootforkindergarten.service.IactivityService;

@RestController
public class MatchingRest {

	@Autowired 
	IMatchingService MatchingService; 
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Matching
		 @GetMapping("/retrieve-all-Matching") 
		 @ResponseBody 
		 public List<Matching> getMatching() { 
			 List<Matching> list = MatchingService.retrieveAllMatching(); 
			 return list; } 
		// Ajouter Matching : http://localhost:8081/SpringMVC/servlet/add-Matching
		 @PostMapping("/add-Matching") 
		 @ResponseBody 
		 public Matching addMatching(@RequestBody Matching m) { 
			 Matching Matching =MatchingService.addMatching(m); 
			 return Matching ; }
		// http://localhost:8081/SpringMVC/servlet/Matching
		 @PutMapping("/Matching/{Matching-id}") 
		 @ResponseBody 
		 public void modifyMatching(@PathVariable("Matching-id") int id) { 
			  MatchingService.MatchingFunction(id);  }
		
}
