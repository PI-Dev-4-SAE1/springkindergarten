package tn.esprit.spring.springbootforkindergarten.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table( name= "Parents")
public class Parents  {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	  @OneToMany(
		        mappedBy = "parent",
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
	public List<Participation> getParticipation() {
		return participation;
	}
	public void setParticipation(List<Participation> participation) {
		this.participation = participation;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Parents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parents(int id, String name, String child_name, Date dateNaissance, String photo, int phone_number,
			String adress, String kindergartenname, Set<Reclamation> reclamations, Set<Rdv> rdvs,
			Set<Feedback> feedbacks, Set<Messaging> messages, Set<Posts> post, Satisfaction satisfaction,
			List<Participation> participation) {
		super();
		this.id = id;
		this.name = name;
		this.child_name = child_name;
		this.dateNaissance = dateNaissance;
		this.photo = photo;
		this.phone_number = phone_number;
		this.adress = adress;
		Kindergartenname = kindergartenname;
		this.reclamations = reclamations;
		Rdvs = rdvs;
		Feedbacks = feedbacks;
		this.messages = messages;
		this.post = post;
		this.satisfaction = satisfaction;
		this.participation = participation;
	}

	
	
	
}
