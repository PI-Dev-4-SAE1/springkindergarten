package tn.esprit.spring.springbootforkindergarten.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table( name= "FEEDBACK")
public class Feedback {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String description;
	private int Rating;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    private childrengarden childrengarden;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Parents parents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public childrengarden getChildrengarden() {
		return childrengarden;
	}

	public void setChildrengarden(childrengarden childrengarden) {
		this.childrengarden = childrengarden;
	}

	public Parents getParents() {
		return parents;
	}

	public void setParents(Parents parents) {
		this.parents = parents;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int id, String description, int rating,
			tn.esprit.spring.springbootforkindergarten.entity.childrengarden childrengarden, Parents parents) {
		super();
		this.id = id;
		this.description = description;
		Rating = rating;
		this.childrengarden = childrengarden;
		this.parents = parents;
	}

	
	
	
	
}
