package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Feedback;

public interface IfeedbackService {
	List<Feedback> retrieveAllFeedback(); 
	Feedback addFeedback(Feedback f); 
	 void deleteFeedback(String id); 
	 Feedback updateFeedback(Feedback f); 
	 Feedback retrieveFeedback(int id);

}
