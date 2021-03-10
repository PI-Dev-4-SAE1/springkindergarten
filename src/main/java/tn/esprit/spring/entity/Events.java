package tn.esprit.spring.entity;


import java.util.Date;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table( name= "EVENTS")
public class Events {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String name;
	private String description;
	private int capacity;
	private String photo;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    private childrengarden childrengardens;
	public childrengarden getChildrengardens() {
		return childrengardens;
	}
	public void setChildrengardens(childrengarden childrengardens) {
		this.childrengardens = childrengardens;
	}
	
	

}
