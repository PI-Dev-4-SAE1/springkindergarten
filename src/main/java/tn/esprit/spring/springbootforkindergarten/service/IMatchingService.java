package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Activity;
import tn.esprit.spring.springbootforkindergarten.entity.Matching;

public interface IMatchingService {
	 List<Matching> retrieveAllMatching(); 
	Matching addMatching(Matching m);
    void MatchingFunction(int id);
    Matching  updateMatching (Matching m ); 
    
}
