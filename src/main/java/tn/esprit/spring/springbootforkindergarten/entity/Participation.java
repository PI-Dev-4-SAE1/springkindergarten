package tn.esprit.spring.springbootforkindergarten.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table( name= "Participation")
public class Participation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	 @ManyToOne
	 //@JsonBackReference(value="event")
	  // @Expose(serialize = false)
	 private Events event ;
	 @ManyToOne
	 //@JsonBackReference(value="parent")
	   //@Expose(serialize = false)
	 private Parents parent ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Events getEvent() {
		return event;
	}
	public void setEvent(Events event) {
		this.event = event;
	}
	public Parents getParent() {
		return parent;
	}
	public void setParent(Parents parent) {
		this.parent = parent;
	}
	public Participation(int id, Events event, Parents parent) {
		super();
		this.id = id;
		this.event = event;
		this.parent = parent;
	}
	public Participation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 
}
