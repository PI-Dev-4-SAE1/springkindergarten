package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Consulatation;
public interface IconsultationService {
	List<Consulatation> retrieveAllConsultation(); 
	Consulatation addConsultation(Consulatation a); 
	 void deleteConsultation(String id); 
	 Consulatation updateConsultation(Consulatation a); 
	 Consulatation retrieveConsultation(int id);
	 Consulatation addautoConsultation(Consulatation a); 

}
