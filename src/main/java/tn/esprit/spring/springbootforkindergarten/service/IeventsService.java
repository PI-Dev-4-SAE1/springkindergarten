package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Events;

public interface IeventsService {
	List<Events> retrieveAllEvents(); 
	Events addEvents(Events e); 
	 void deleteEvents(String id); 
	 Events updateEvents(Events e); 
	 Events retrieveEvents(int id);

}
