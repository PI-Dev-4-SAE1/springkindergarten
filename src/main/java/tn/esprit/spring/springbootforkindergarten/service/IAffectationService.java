package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Affectation;

public interface IAffectationService {
	 List<Affectation> retrieveAllAffectation(); 
	 List<Affectation> MesAffectation(int idParent); 
	 Affectation addAffectation(Affectation a); 
	 void deleteAffectation(String id); 
	 
}
