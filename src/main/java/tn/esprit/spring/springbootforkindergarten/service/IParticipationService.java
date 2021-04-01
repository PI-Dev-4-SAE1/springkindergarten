package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Participation;


public interface IParticipationService {
	List<Participation> retrieveAllParticipations(); 
	List<Participation> retrieveParticipationsByUser(int idUser); 
	Participation addParticipations(Participation e); 
	 void deleteParticipation(String id); 
}
