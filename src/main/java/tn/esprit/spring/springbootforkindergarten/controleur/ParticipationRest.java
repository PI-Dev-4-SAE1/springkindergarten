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

import tn.esprit.spring.springbootforkindergarten.entity.Events;
import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.Participation;
import tn.esprit.spring.springbootforkindergarten.service.IParentService;
import tn.esprit.spring.springbootforkindergarten.service.IParticipationService;
import tn.esprit.spring.springbootforkindergarten.service.IeventsService;

@RestController
public class ParticipationRest {
	@Autowired 
	 IParticipationService ParticipationService; 
	@Autowired 
	 IeventsService EventService; 
	@Autowired 
	 IParentService ParentService;
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Participations

	@GetMapping("/retrieve-all-Participations") 
	 @ResponseBody 
	 public List<Participation> getParticipations() { 
		 List<Participation> list = ParticipationService.retrieveAllParticipations(); 
		 return list; } 
	
	// Ajouter Participation : http://localhost:8081/SpringMVC/servlet/add-Participation
		 @PostMapping("/add-Participation/{Event-id}/{Parent-id}") 
		 @ResponseBody 
		 public Participation addParticipation(@RequestBody Participation p , @PathVariable("Event-id") int EventId,@PathVariable("Parent-id") int ParentId) { 
			 Events e = EventService.retrieveEvents(EventId);
			 p.setEvent(e);
			 Parents pare = ParentService.retrieveParents(ParentId);
			 p.setParent(pare);
			 Participation participation = ParticipationService.addParticipations(p); 
			 return participation; }
		 
		//http://localhost:8081/SpringMVC/servlet/remove-Participation/{Participation-id}
		 @DeleteMapping("/remove-Participation/{Participation-id}") 
		 @ResponseBody 
		 public void removeParticipation(@PathVariable("Participation-id") String ParticipationId) {
			 ParticipationService.deleteParticipation(ParticipationId); 
			  } 
}
