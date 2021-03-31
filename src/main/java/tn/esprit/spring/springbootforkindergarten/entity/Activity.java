package tn.esprit.spring.springbootforkindergarten.entity;
import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Table( name= "ACTIVITY")
public class Activity {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@NotEmpty(message = "{NotEmpty}")
	private String nom ;
	private String description;
	@FutureOrPresent
	@Temporal(TemporalType.DATE)
	private Date date;
	@NotNull
	private float prix ;
	
	
	@OneToMany(
	        mappedBy = "activity",
	        cascade = CascadeType.ALL
	    )	
	@JsonBackReference(value="affectation")
	@JsonIgnore
	private List<Affectation> affectation;
	@OneToMany(
	        mappedBy = "activity",
	        cascade = CascadeType.ALL
	    )	
	@JsonBackReference(value="Rating")
	private List<RatingActivity> Rating;
	@OneToMany(
	        mappedBy = "activity",
	        cascade = CascadeType.ALL
	    )	
	@JsonBackReference(value="ReclamationActivity")
	private List<ReclamationActivity> ReclamationActivity;
	
	@ManyToMany(mappedBy = "activities",cascade = CascadeType.ALL)
    private Set<childrengarden> childrengardens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public List<Affectation> getAffectation() {
		return affectation;
	}

	public void setAffectation(List<Affectation> affectation) {
		this.affectation = affectation;
	}

	public List<RatingActivity> getRating() {
		return Rating;
	}

	public void setRating(List<RatingActivity> rating) {
		Rating = rating;
	}

	public List<ReclamationActivity> getReclamation() {
		return ReclamationActivity;
	}

	public void setReclamation(List<ReclamationActivity> reclamation) {
		ReclamationActivity = reclamation;
	}

	public Set<childrengarden> getChildrengardens() {
		return childrengardens;
	}

	public void setChildrengardens(Set<childrengarden> childrengardens) {
		this.childrengardens = childrengardens;
	}

	public Activity(int id, String nom, String description, Date date, float prix, List<Affectation> affectation,
			List<RatingActivity> rating, List<ReclamationActivity> reclamation, Set<childrengarden> childrengardens) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.prix = prix;
		this.affectation = affectation;
		Rating = rating;
		ReclamationActivity = reclamation;
		this.childrengardens = childrengardens;
	}

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	

	
	
}
