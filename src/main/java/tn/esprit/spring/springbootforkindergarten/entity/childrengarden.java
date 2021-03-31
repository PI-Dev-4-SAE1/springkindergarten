package tn.esprit.spring.springbootforkindergarten.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name= "CHILDRENGARDEN")
public class childrengarden extends User{

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String description;
	private String nom;
	
	@Temporal(TemporalType.DATE)
	private Date Creation_Date;
	
	private String location;
	private String photo;
	private int phone_number;
	private int price ;
	@OneToMany(
	        mappedBy = "childrengarden",
	        cascade = CascadeType.ALL
	    )	
	@JsonBackReference(value="matchings")
	private List<Matching> matchings;
	
	@ManyToMany(cascade = CascadeType.ALL)
    private Set<Activity> activities;

	 @ManyToOne
	 @JsonBackReference(value="message")
	 private Messaging message ;

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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getCreation_Date() {
		return Creation_Date;
	}

	public void setCreation_Date(Date creation_Date) {
		Creation_Date = creation_Date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Matching> getMatching() {
		return matchings;
	}

	public void setMatching(List<Matching> matching) {
		matchings = matching;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	public Messaging getMessage() {
		return message;
	}

	public void setMessage(Messaging message) {
		this.message = message;
	}

	public childrengarden(int id, String email, String password, int phone) {
		super(id, email, password, phone);
		// TODO Auto-generated constructor stub
	}

	public childrengarden(int id, String email, String password, int phone, int id2, String description, String nom,
			Date creation_Date, String location, String photo, int phone_number, int price,
			List<tn.esprit.spring.springbootforkindergarten.entity.Matching> matching, Set<Activity> activities,
			Messaging message) {
		super(id, email, password, phone);
		id = id2;
		this.description = description;
		this.nom = nom;
		Creation_Date = creation_Date;
		this.location = location;
		this.photo = photo;
		this.phone_number = phone_number;
		this.price = price;
		this.matchings = matching;
		this.activities = activities;
		this.message = message;
	}
	 
	 
	
	
	
	
}
