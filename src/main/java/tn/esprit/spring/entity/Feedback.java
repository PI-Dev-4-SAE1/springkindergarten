package tn.esprit.spring.entity;

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
    private childrengarden childrengardens;
	
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

	public childrengarden getChildrengardens() {
		return childrengardens;
	}

	public void setChildrengardens(childrengarden childrengardens) {
		this.childrengardens = childrengardens;
	}

	public Parents getParents() {
		return parents;
	}

	public void setParents(Parents parents) {
		this.parents = parents;
	}
	
	
	
}
