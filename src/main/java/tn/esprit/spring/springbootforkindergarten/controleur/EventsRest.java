package tn.esprit.spring.springbootforkindergarten.controleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootforkindergarten.entity.Events;
import tn.esprit.spring.springbootforkindergarten.service.IeventsService;

@RestController
public class EventsRest {
	@Autowired 
	 IeventsService EventsService; 
	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Events 
	 @GetMapping("/retrieve-all-Events") 
	 @ResponseBody 
	 public List<Events> getEvents() { 
		 List<Events> list = EventsService.retrieveAllEvents(); 
		 return list; } 
	//http://localhost:8081/SpringMVC/servlet/retrieve-Events/{Events-id} 
	 @GetMapping("/retrieve-Events/{Events-id}") 
	 @ResponseBody 
	 public Events retrieveEvents(@PathVariable("Events-id") int EventsId) { 
		 return EventsService.retrieveEvents(EventsId);  } 
	// Ajouter Events : http://localhost:8081/SpringMVC/servlet/add-Events 
	 @PostMapping("/add-Events") 
	 @ResponseBody 
	 public Events addEvents(@RequestBody Events e) { 
		 Events Events = EventsService.addEvents(e); 
		 return Events ; }
	//http://localhost:8081/SpringMVC/servlet/remove-Events/{Events-id} 
	 @DeleteMapping("/remove-Events/{Events-id}") 
	 @ResponseBody 
	 public void removeEvents(@PathVariable("Events-id") String EventsId) {
		 EventsService.deleteEvents(EventsId); 
		  } 
	 // http://localhost:8081/SpringMVC/servlet/modify-Events
	 @PutMapping("/modify-Events") 
	 @ResponseBody 
	 public Events modifyEvents(@RequestBody Events Events) { 
		 return EventsService.updateEvents(Events);  }
	 
	 
	//http://localhost:8081/SpringMVC/servlet/NbreEvent

		@GetMapping("/NbreEvent")
		 @ResponseBody
		public int getNombreEventJPQL() {
			 List<Events> list = EventsService.retrieveAllEvents(); 
			return list.size();

		}
		//http://localhost:8081/SpringMVC/servlet/Eventname

		@GetMapping("/Eventname")

		 @ResponseBody

		public List<String> getAllEventNames() {

			List<String> listName = new ArrayList<>() ;

			 List<Events> list = EventsService.retrieveAllEvents(); 
			 for (Events events : list) {
				 listName.add(events.getName());
			}
			return listName;

		}
		//http://localhost:8081/SpringMVC/servlet/retrievealleventsoftoday

		@GetMapping(value = "/retrievealleventsoftoday")

		@ResponseBody

		public List<Events> getAllEventPourToday() {

			return  EventsService.getAllEventPourToday();
			}
		//http://localhost:8081/SpringMVC/servlet/retrieve-all-eventsordonnebydate

				@GetMapping(value = "/retrieve-all-eventsordonnebydate")

				@ResponseBody

				public List<Events> getAllEventOrdonneParDate() {

					return EventsService.getAllEventOrdonneParDate();

				}

}

