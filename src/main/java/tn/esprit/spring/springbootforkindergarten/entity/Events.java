package tn.esprit.spring.springbootforkindergarten.entity;


import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table( name= "EVENTS")
public class Events {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	 @NotEmpty(message = "{NotEmpty}")
	private String name;
	 
	private String description;
	@Min(10)
	private int capacity;
	@NotNull
	private float price ; 
	@FutureOrPresent
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private childrengarden childrengardens;
	@OneToMany(
	        mappedBy = "event",
	        cascade = CascadeType.ALL
	    )	
	 @JsonBackReference(value="participation")
	private List<Participation> participation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public childrengarden getChildrengardens() {
		return childrengardens;
	}
	public void setChildrengardens(childrengarden childrengardens) {
		this.childrengardens = childrengardens;
	}
	public List<Participation> getParticipation() {
		return participation;
	}
	public void setParticipation(List<Participation> participation) {
		this.participation = participation;
	}
	public Events(int id, String name, String description, int capacity, float price, Date date,
			childrengarden childrengardens, List<Participation> participation) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.price = price;
		this.date = date;
		this.childrengardens = childrengardens;
		this.participation = participation;
	}
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
