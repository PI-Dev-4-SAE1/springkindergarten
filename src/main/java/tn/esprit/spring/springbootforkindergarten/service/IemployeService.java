package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Employe;

public interface IemployeService {
	List<Employe> retrieveAllEmploye(); 
	Employe addEmploye(Employe a); 
	 void deleteEmploye(String id); 
	 Employe updateEmploye(Employe a); 
	 Employe retrieveEmploye(int id);
	 List<Employe> retrieveEmployejob(String job);
	Employe retrievefirst_nameAndlast_name(String first_name, String last_name);
	List<Employe> retrieveemailAndpassword(String email, String password);
	List<Employe> retrieveeverything(String email, String first_name, String job, String last_name, String password);
	 
	
}
