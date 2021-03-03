package tn.esprit.spring.springbootforkindergarten.entity;


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
	private float price ; 
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private childrengarden childrengardens;

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

	public Events(int id, String name, String description, int capacity, float price, Date date,
			childrengarden childrengardens) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.capacity = capacity;
		this.price = price;
		this.date = date;
		this.childrengardens = childrengardens;
	}

	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Events [id=" + id + ", name=" + name + ", description=" + description + ", capacity=" + capacity
				+ ", price=" + price + ", date=" + date + ", childrengardens=" + childrengardens + "]";
	}
	
	
	
	
	

}
