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

import tn.esprit.spring.springbootforkindergarten.entity.Rdv;
import tn.esprit.spring.springbootforkindergarten.service.IRdvService;

@RestController
public class RdvRest {
	@Autowired 
	 IRdvService RdvService; 
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Rdv 
	 @GetMapping("/retrieve-all-Rdv") 
	 @ResponseBody 
	 public List<Rdv> getRdv() { 
		 List<Rdv> list = RdvService.retrieveAllRdv(); 
		 return list; } 
	//http://localhost:8081/SpringMVC/servlet/retrieve-Rdv/{Rdv-id} 
	 @GetMapping("/retrieve-Rdv/{Rdv-id}") 
	 @ResponseBody 
	 public Rdv retrieveRdv(@PathVariable("Rdv-id") int RdvId) { 
		 return RdvService.retrieveRdv(RdvId);  } 
	// Ajouter Rdv : http://localhost:8081/SpringMVC/servlet/add-Rdv
	 @PostMapping("/add-Rdv") 
	 @ResponseBody 
	 public Rdv addRdv(@RequestBody Rdv r) { 
		 Rdv Rdv = RdvService.addRdv(r); 
		 return Rdv; }
	//http://localhost:8081/SpringMVC/servlet/remove-Rdv/{Rdv-id} 
	 @DeleteMapping("/remove-Rdv/{Rdv-id}") 
	 @ResponseBody 
	 public void removeRdv(@PathVariable("Rdv-id") String RdvId) {
		 RdvService.deleteRdv(RdvId); 
		  } 
	 // http://localhost:8081/SpringMVC/servlet/modify-Rdv 
	 @PutMapping("/modify-Rdv") 
	 @ResponseBody 
	 public Rdv modifyRdv(@RequestBody Rdv Rdv) { 
		 return RdvService.updateRdv(Rdv);  }
	 
	// http://localhost:8081/SpringMVC/servlet/search/{key}
	 @GetMapping("/search/{key}") 
	 @ResponseBody 
	 public List<Rdv>  search(@PathVariable ("key") String key) { 
		return RdvService.searchrdv(key);  }
}
