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

import tn.esprit.spring.springbootforkindergarten.entity.Consulatation;
import tn.esprit.spring.springbootforkindergarten.entity.Employe;
import tn.esprit.spring.springbootforkindergarten.service.IconsultationService;

@RestController
public class ConsultationRest {
	
	@Autowired 
	 IconsultationService ConsultationService; 
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Consultation
	@GetMapping("/retrieve-all-Consultation")
	@ResponseBody 
	 public List<Consulatation> getConsultation() { 
		 List<Consulatation> list = ConsultationService.retrieveAllConsultation(); 
		 return list; }
	
	
	//http://localhost:8081/SpringMVC/servlet/retrieve-consultation/{consultation-id}
	 @GetMapping("/retrieve-consultation/{consultation-id}") 
	 @ResponseBody 
	 public Consulatation retrieveConsultation(@PathVariable("consultation-id") int ConsultationId) { 
		 return ConsultationService.retrieveConsultation(ConsultationId); } 
	 
	 
	// http://localhost:8081/SpringMVC/servlet/add-consultation 
			 @PostMapping("/add-consultation") 
			 @ResponseBody 
			 public Consulatation addConsultation(@RequestBody Consulatation a) { 
				 Consulatation consult = ConsultationService.addConsultation(a); 
				 return consult ; }
			 
			 
			 
	//http://localhost:8081/SpringMVC/servlet/remove-consultation/{consultation-id} 
	@DeleteMapping("/remove-consultation/{consultation-id}") 
	@ResponseBody 
	public void removeEmploye(@PathVariable("consultation-id") String ConsultationId) {
	ConsultationService.deleteConsultation(ConsultationId); 
		 } 
	
	// http://localhost:8081/SpringMVC/servlet/modify-Consultation 
			 @PutMapping("/modify-Consultation") 
			 @ResponseBody 
			 public Consulatation modifyConsultation(@RequestBody Consulatation Consultation) { 
				 return ConsultationService.updateConsultation(Consultation);  }
			 
	
			// http://localhost:8081/SpringMVC/servlet/add-auto-consultation 
			 @PostMapping("/add-auto-consultation") 
			 @ResponseBody 
			 public Consulatation addautoConsultation(@RequestBody Consulatation a) {
				 
				 Consulatation consult = ConsultationService.addautoConsultation(a); 
				 
				 return consult ; }
	
}	
