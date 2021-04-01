package tn.esprit.spring.springbootforkindergarten.controleur;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.childrengarden;
import tn.esprit.spring.springbootforkindergarten.service.IParentService;


@RestController
public class ParentsRest {
	@Autowired 
	 IParentService ParentService; 
	
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Parents 
	 @GetMapping("/retrieve-all-Parents") 
	 @ResponseBody 
	 public List<Parents> getActivity() { 
		 List<Parents> list = ParentService.retrieveAllParents(); 
		 return list; } 
	 
	 
		//http://localhost:8081/SpringMVC/servlet/retrieve-Parent/{Parent-id} 
		 @GetMapping("/retrieve-Parent/{Parent-id}") 
		 @ResponseBody 
		 public Parents retrieveParent(@PathVariable("Parent-id") int ParentId) { 
			 return ParentService.retrieveParents(ParentId);  } 
		 
		 
		// Ajouter Parent : http://localhost:8081/SpringMVC/servlet/add-Parent 
		 /*@PostMapping("/add-Parent") 
		 @ResponseBody 
		 public Parents addParent(@RequestBody Parents p) throws IOException { 
			
			 Parents parents = ParentService.addParents(p); 
			 return parents ; }*/
	
	
		//http://localhost:8081/SpringMVC/servlet/remove-Parent/{Parent-id} 
		 /*@DeleteMapping("/remove-Parent/{Parent-id}") 
		 @ResponseBody 
		 public void removeParent(@PathVariable("Parent-id") String ParentId) {
			 ParentService.deleteParents(ParentId); 
			  } */
	
		 
		 // http://localhost:8081/SpringMVC/servlet/modify-Parent 
		 @PutMapping("/modify-Parent") 
		 @ResponseBody 
		 public Parents modifyActivity(@RequestBody Parents p) { 
			 return ParentService.updateParents(p);  
			 }
		 @GetMapping("/rechercheparprice/{price}")
		 @ResponseBody
		 public List<String> rechercheparprice(@PathVariable("price")int price){
			 return ParentService.KinderGarten(price);
		 }
		 @GetMapping("/rechercheparcity/{city}/{governate}")
		 @ResponseBody
		 public List<String> rechercheparprice(@PathVariable("city")String city,@PathVariable("governate")String governate){
			 return ParentService.KinderGartenBYCityAndGovernate(city, governate);
		 }
		 @GetMapping("/KinderGartenByLikes")
		 @ResponseBody
		 public List<childrengarden> KinderGartenByLikes(){
			 return ParentService.KinderGartenByLikes();
		 }
		 
		 
		 @Scheduled(cron = "0 8 * * *")
		 @GetMapping("/Notif/{id}")
		 @ResponseBody
		 public String Notif(@PathVariable("id")int id){
			 java.util.Date inscrit = ParentService.InscriptionDate(id);
			    long diffInMillies = inscrit.getTime() - new java.util.Date().getTime();
			    long diffJour = 	diffInMillies * 1000 *60 *60 *24 ; 
			    if(diffJour >= 27 )
			    	return "vous avez 3 jours pour payer !";
			 return "il vous reste du temps" ; 
		 }
		 
	}
		 


