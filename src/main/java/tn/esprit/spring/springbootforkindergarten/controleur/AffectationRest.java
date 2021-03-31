package tn.esprit.spring.springbootforkindergarten.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootforkindergarten.entity.Affectation;
import tn.esprit.spring.springbootforkindergarten.service.IAffectationService;
import tn.esprit.spring.springbootforkindergarten.service.IParentService;
import tn.esprit.spring.springbootforkindergarten.service.IactivityService;



@RestController
public class AffectationRest {
	@Autowired 
	 IAffectationService AffectationService; 
	@Autowired
	IParentService ParentService ;
	@Autowired
	IactivityService ActivityService ; 
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Affectation 
	 @GetMapping("/retrieve-all-Affectation") 
	 @ResponseBody 
	 public List<Affectation> getAffectation() { 
		 List<Affectation> list = AffectationService.retrieveAllAffectation(); 
		 return list; } 
	//http://localhost:8081/SpringMVC/servlet/retrieve-Affectation-Parent/{Parent-id} 
	 @GetMapping("/retrieve-Affectation-Parent/{Parent-id}") 
	 @ResponseBody 
	 public List<Affectation> retrieveAffectation(@PathVariable("Parent-id") int ParentId) { 
		 return AffectationService.MesAffectation(ParentId);  } 
	// Ajouter Activity : http://localhost:8081/SpringMVC/servlet/add-Affectation 
	 @PostMapping("/add-Affectation/{Parent-id}/{Activity-id}") 
	 @ResponseBody 
	 public Affectation addAffectation(@RequestBody Affectation a , @PathVariable("Parent-id")int ParentId,@PathVariable("Activity-id")int activityId) { 
		 a.setParent(ParentService.retrieveParents(ParentId));
		 a.setActivity(ActivityService.retrieveActivity(activityId));
		 Affectation Affectation = AffectationService.addAffectation(a); 
		 return Affectation ; }
	//http://localhost:8081/SpringMVC/servlet/remove-Affectation/{Affectation-id} 
	 @DeleteMapping("/remove-Affectation/{Affectation-id}") 
	 @ResponseBody 
	 public void removeAffectation(@PathVariable("Affectation-id") String AffectationId) {
		 AffectationService.deleteAffectation(AffectationId); 
		  } 
}
