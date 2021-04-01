package tn.esprit.spring.springbootforkindergarten.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springbootforkindergarten.entity.Events;

@Repository
public interface eventsRepository extends CrudRepository <Events,Integer >{

	

    public Events findByName( String name);


	 public List<Events> findByDate( Date date );

	 
	 		public List<Events> findAllByOrderByDateAsc();


}
