package tn.esprit.spring.springbootforkindergarten.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table( name= "CHILDRENGARDEN")
public class childrengarden extends User{

	public childrengarden() {
		super();
		// TODO Auto-generated constructor stub
	}
	public childrengarden(int id, String email, String password, int phone) {
		super(id, email, password, phone);
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String description;
	private String nom;
	private String governate;
	private String city;
	@Temporal(TemporalType.DATE)
	private Date Creation_Date;
	private String location;
	private String photo;
	private int phone_number;
	private int price ;
	private String email_garden;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="child")
	private List<LikeKinderGarten> likes;
	private int count_like;
	private int count_dislike;
	
	
	
	
	public int getCount_dislike() {
		return count_dislike;
	}
	public void setCount_dislike(int count_dislike) {
		this.count_dislike = count_dislike;
	}
	public childrengarden(String description, String nom, String governate, String city, Date creation_Date,
			String location, String photo, int phone_number, int price, String email_garden,
			List<LikeKinderGarten> likes, int count_like,int count_dislike, Set<Reclamation> reclamations, Set<Activity> activities,
			Set<Parents> parents, Set<Rdv> rdvs, Set<Feedback> feedbacks, Set<Events> events, Messaging message) {
		super();
		this.description = description;
		this.nom = nom;
		this.governate = governate;
		this.city = city;
		Creation_Date = creation_Date;
		this.location = location;
		this.photo = photo;
		this.phone_number = phone_number;
		this.price = price;
		this.email_garden = email_garden;
		this.likes = likes;
		this.count_like = count_like;
		this.count_dislike = count_dislike;
		this.reclamations = reclamations;
		this.activities = activities;
		this.parents = parents;
		Rdvs = rdvs;
		Feedbacks = feedbacks;
		this.events = events;
		this.message = message;
	}
	public List<LikeKinderGarten> getLikes() {
		return likes;
	}
	public void setLikes(List<LikeKinderGarten> likes) {
		this.likes = likes;
	}
	public int getCount_like() {
		return count_like;
	}
	public void setCount_like(int count_like) {
		this.count_like = count_like;
	}
	public String getEmail_garden() {
		return email_garden;
	}
	public void setEmail_garden(String email_garden) {
		this.email_garden = email_garden;
	}
	public String getGovernate() {
		return governate;
	}
	public void setGovernate(String governate) {
		this.governate = governate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Set<Parents> getParents() {
		return parents;
	}
	public void setParents(Set<Parents> parents) {
		this.parents = parents;
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
	@Override
	public String toString() {
		return "childrengarden [description=" + description + ", nom=" + nom + ", Creation_Date=" + Creation_Date
				+ ", location=" + location + ", photo=" + photo + ", phone_number=" + phone_number + ", price=" + price
				+ "]";
	}
	
	@OneToMany(mappedBy = "childrengardens",cascade = CascadeType.ALL)
    private Set<Reclamation> reclamations;
	
	
	@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Activity> activities;
	
	@ManyToMany(mappedBy = "garden",cascade = CascadeType.ALL)
	private Set<Parents> parents;
	
	@OneToMany(mappedBy = "childrengarden",cascade = CascadeType.ALL)
    private Set<Rdv> Rdvs;
	
	@OneToMany(mappedBy = "childrengarden",cascade = CascadeType.ALL)
    private Set<Feedback> Feedbacks;
	
	@OneToMany(mappedBy = "childrengardens",cascade = CascadeType.ALL)
    private Set<Events> events;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Messaging message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Reclamation> getReclamations() {
		return reclamations;
	}
	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}
	public Set<Activity> getActivities() {
		return activities;
	}
	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}
	public Set<Rdv> getRdvs() {
		return Rdvs;
	}
	public void setRdvs(Set<Rdv> rdvs) {
		Rdvs = rdvs;
	}
	public Set<Feedback> getFeedbacks() {
		return Feedbacks;
	}
	public void setFeedbacks(Set<Feedback> feedbacks) {
		Feedbacks = feedbacks;
	}
	public Set<Events> getEvents() {
		return events;
	}
	public void setEvents(Set<Events> events) {
		this.events = events;
	}
	public Messaging getMessage() {
		return message;
	}
	public void setMessage(Messaging message) {
		this.message = message;
	}
	
	
	
}
