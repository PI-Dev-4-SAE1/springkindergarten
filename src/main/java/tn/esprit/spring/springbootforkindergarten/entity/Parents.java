package tn.esprit.spring.springbootforkindergarten.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import java.util.Set;

@Entity
@Table( name= "Parents")
public class Parents extends User {

	public Parents(int id, String email, String password, int phone) {
		super(id, email, password, phone);
		
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String name;
	private String child_name;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String photo;
	private int phone_number;
	private String adress;
	
	private String Kindergartenname;

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

	public String getChild_name() {
		return child_name;
	}

	public void setChild_name(String child_name) {
		this.child_name = child_name;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getKindergartenname() {
		return Kindergartenname;
	}

	public void setKindergartenname(String kindergartenname) {
		Kindergartenname = kindergartenname;
	}

	public Parents(int id, String email, String password, int phone, int id2, String name, String child_name,
			Date dateNaissance, String photo, int phone_number, String adress, String kindergartenname) {
		super(id, email, password, phone);
		id = id2;
		this.name = name;
		this.child_name = child_name;
		this.dateNaissance = dateNaissance;
		this.photo = photo;
		this.phone_number = phone_number;
		this.adress = adress;
		Kindergartenname = kindergartenname;
	}
	
	
	 
	 @OneToMany(mappedBy = "parents",cascade = CascadeType.ALL)
    private Set<Reclamation> reclamations;
	 
	 @OneToMany( mappedBy = "parents",cascade = CascadeType.ALL)
	    private Set<Rdv> Rdvs;
	 
	 
	 @OneToMany(mappedBy = "parents",cascade = CascadeType.ALL)
	    private Set<Feedback> Feedbacks;
	 
	 @ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	    private Set<Messaging> messages;
	 
	 
	 @ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	    private Set<Posts> post;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	    private Satisfaction satisfaction;

	public Set<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
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

	public Set<Messaging> getMessages() {
		return messages;
	}

	public void setMessages(Set<Messaging> messages) {
		this.messages = messages;
	}

	public Set<Posts> getPost() {
		return post;
	}

	public void setPost(Set<Posts> post) {
		this.post = post;
	}

	public Satisfaction getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(Satisfaction satisfaction) {
		this.satisfaction = satisfaction;
	}
	
	
	
	
	
	
}
