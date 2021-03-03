package tn.esprit.spring.springbootforkindergarten.service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.springbootforkindergarten.entity.Events;
import tn.esprit.spring.springbootforkindergarten.repository.eventsRepository;

@Service
public class EventsService implements IeventsService{
	@Autowired
	eventsRepository eventsRepo;
	private static final Logger l = LogManager.getLogger(EventsService.class);
	@Override
	public List<Events> retrieveAllEvents() {
		List<Events> evenements = (List<Events>) eventsRepo.findAll();
		for(Events ev : evenements)
		{
			l.info("evenements +++ : "+ev);
		}
		return evenements;
		// TODO Auto-generated method stub
			}
	@Override
	public Events addEvents(Events e) {
		l.info("Adding events with ID: "+e.getId());
		return eventsRepo.save(e);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEvents(String id) {
		l.info("Deleting events with ID: "+id);
		eventsRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
		
	}
	@Override
	public Events updateEvents(Events e) {
		l.info("Updating events with ID: "+e.getId());
		return this.eventsRepo.save(e);
		// TODO Auto-generated method stub
		
	}
	@Override
	public Events retrieveEvents(int id) {
		l.info("Retriving events with ID: "+id);
		return this.eventsRepo.findById(id).get();
		// TODO Auto-generated method stub
		
	}

}
