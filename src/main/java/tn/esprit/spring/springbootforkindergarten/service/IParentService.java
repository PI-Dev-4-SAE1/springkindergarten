package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;


public interface IParentService {
	List<Parents> retrieveAllParents(); 
	Parents addParents(Parents p); 
	 void deleteParents(String id); 
	 Parents updateParents(Parents p); 
	 Parents retrieveParents(int id);
}
