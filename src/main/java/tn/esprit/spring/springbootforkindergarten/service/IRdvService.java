package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Rdv;

public interface IRdvService {
	List<Rdv> retrieveAllRdv(); 
	Rdv addRdv(Rdv r); 
	 void deleteRdv(String id); 
	 Rdv updateRdv(Rdv r); 
	 Rdv retrieveRdv(int id);
}
