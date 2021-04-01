package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Events;
@Service
public interface IeventsService {
	List<Events> retrieveAllEvents(); 
	Events addEvents(Events e); 
	 void deleteEvents(String id); 
	 Events updateEvents(Events e); 
	 Events retrieveEvents(int id);
	 
	 public Events getEvent(String name);
	 public List<Events> getAllEventPourToday();
	 public List<Events> getAllEventOrdonneParDate();
}
