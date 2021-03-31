package tn.esprit.spring.springbootforkindergarten.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.service.IParentService;

@RestController
public class ParentRest {
	@Autowired 
	 IParentService ParentService; 
	// Ajouter Parent : http://localhost:8081/SpringMVC/servlet/add-Parent
		 @PostMapping("/add-Parent") 
		 @ResponseBody 
		 public Parents addParent(@RequestBody Parents p) { 
			 Parents Parent = ParentService.addParent(p); 
			 return Parent ; }
}
