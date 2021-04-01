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

import tn.esprit.spring.springbootforkindergarten.entity.Employe;
import tn.esprit.spring.springbootforkindergarten.service.IemployeService;

@RestController
public class EmployeRest {

	@Autowired 
	 IemployeService EmployeService; 
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Employe
	@GetMapping("/retrieve-all-Employe")
	@ResponseBody 
	 public List<Employe> getEmploye() { 
		 List<Employe> list = EmployeService.retrieveAllEmploye();
		 
		 
		 
		 return list; }
	
	//http://localhost:8081/SpringMVC/servlet/retrieve-Employe/{Employe-id} 
		 @GetMapping("/retrieve-Employe/{Employe-id}") 
		 @ResponseBody 
		 public Employe retrieveEmploye(@PathVariable("Employe-id") int EmployeId) { 
			 return EmployeService.retrieveEmploye(EmployeId);  } 
		 
		 
		// Ajouter Employe : http://localhost:8081/SpringMVC/servlet/add-Employe 
		 @PostMapping("/add-Employe") 
		 @ResponseBody 
		 public Employe addEmploye(@RequestBody Employe a) { 
			 
			 Employe Employe = EmployeService.addEmploye(a);
			 
			 return Employe ; }
		 
		 
		 
		//http://localhost:8081/SpringMVC/servlet/remove-Employe/{Employe-id} 
		 @DeleteMapping("/remove-Employe/{Employe-id}") 
		 @ResponseBody 
		 public void removeEmploye(@PathVariable("Employe-id") String EmployeId) {
			 EmployeService.deleteEmploye(EmployeId); 
			  } 
		 
		 
		 // http://localhost:8081/SpringMVC/servlet/modify-Employe 
		 @PutMapping("/modify-Employe") 
		 @ResponseBody 
		 public Employe modifyEmploye(@RequestBody Employe Employe) { 
			 return EmployeService.updateEmploye(Employe);  }
		 
		//http://localhost:8081/SpringMVC/servlet/retrieve-Employe-job/{job} 
		 @GetMapping("/retrieve-Employe-job/{job}") 
		 @ResponseBody 
		 public List<Employe> retrieveEmployejob(@PathVariable("job") String job) {
			 
			 List<Employe> list = EmployeService.retrieveEmployejob(job); 
			 
			 return list; }
		 
		//http://localhost:8081/SpringMVC/servlet/retrieve-Employe-first_nameAndlast_name/{first_name}/{last_name} 
		 @GetMapping("/retrieve-Employe-first_nameAndlast_name/{first_name}/{last_name}") 
		 @ResponseBody 
		 public Employe retrievefirst_nameAndlast_name(@PathVariable("first_name") String first_name,@PathVariable("last_name") String last_name) {
			 
			 return EmployeService.retrievefirst_nameAndlast_name(first_name,last_name); }
		
		 
		//http://localhost:8081/SpringMVC/servlet/retrieve-Employe-emailAndpassword/{email}/{password} 
		 @GetMapping("/retrieve-Employe-emailAndpassword/{email}/{password}") 
		 @ResponseBody 
		 public List<Employe> retrieveemailAndpassword(@PathVariable("email") String email,@PathVariable("password") String password) {
			 
			 List<Employe> list = EmployeService.retrieveemailAndpassword(email,password); 
			 return list;
		 }
		 
		//http://localhost:8081/SpringMVC/servlet/retrieve-Employe-everything/{email}/{first_name}/{job}/{last_name}/{password} 
		 @GetMapping("/retrieve-Employe-everything/{email}/{first_name}/{job}/{last_name}/{password}") 
		 @ResponseBody 
		 public List<Employe> retrieveeverything(@PathVariable("email") String email,@PathVariable("first_name") String first_name,@PathVariable("job") String job,@PathVariable("last_name") String last_name,@PathVariable("password") String password) {
			 
			 List<Employe> list = EmployeService.retrieveeverything(email,first_name,job,last_name,password); 
			 return list;
		 }
		 
}
