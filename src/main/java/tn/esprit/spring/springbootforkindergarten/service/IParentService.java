package tn.esprit.spring.springbootforkindergarten.service;


import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.Rdv;

public interface IParentService {

	Parents addParent(Parents p); 
	List<Parents> retrieveAllParents(); 
	 void deleteParents(String id); 
	 Parents updateParents(Parents p); 
	 Parents retrieveParents(int id);
}
