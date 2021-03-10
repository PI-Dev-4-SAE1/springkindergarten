package tn.esprit.spring.entity;

import java.util.Date;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name= "SATISFACTION")
public class Satisfaction {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String question;
	private String response;
	private int rating;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@OneToMany(mappedBy = "satisfaction",cascade = CascadeType.ALL)
    private Set<Parents> parents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Parents> getParents() {
		return parents;
	}

	public void setParents(Set<Parents> parents) {
		this.parents = parents;
	}
	

}
