package tn.esprit.spring.springbootforkindergarten.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
	@JsonProperty("name")
	private String name;
	@JsonProperty("childname")
	private String childname;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String photo;
	private int phone_number;
	private String adress;
	
	private String Kindergartenname;
   
	@OneToMany(
	        mappedBy = "Parent",
	        cascade = CascadeType.ALL
	    )	
	@JsonBackReference(value="Matching")
	private List<Matching> Matching;
	@OneToMany(
	        mappedBy = "parent",
	        cascade = CascadeType.ALL
	    )	
	@JsonBackReference(value="Affectation")
	//@JsonIgnore
	private List<Affectation> Affectation;
	
	
	@ManyToMany
	 @JsonBackReference(value="messages")
	 private Set<Messaging> messages ;
	@ManyToMany(cascade = CascadeType.ALL)
    private Set<Posts> posts;
	
	 @ManyToOne
	 @JsonBackReference(value="satisfaction")
	 Satisfaction satisfaction ;

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

	public String getChildname() {
		return childname;
	}

	public void setChildname(String childname) {
		this.childname = childname;
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

	public List<Matching> getMatching() {
		return Matching;
	}

	public void setMatching(List<Matching> matching) {
		Matching = matching;
	}

	public List<Affectation> getAffectation() {
		return Affectation;
	}

	public void setAffectation(List<Affectation> affectation) {
		Affectation = affectation;
	}

	public Set<Messaging> getMessages() {
		return messages;
	}

	public void setMessages(Set<Messaging> messages) {
		this.messages = messages;
	}

	public Set<Posts> getPosts() {
		return posts;
	}

	public void setPosts(Set<Posts> posts) {
		this.posts = posts;
	}

	public Satisfaction getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(Satisfaction satisfaction) {
		this.satisfaction = satisfaction;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Parents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parents(int id, String name, String childname, Date dateNaissance, String photo, int phone_number,
			String adress, String kindergartenname,
			List<tn.esprit.spring.springbootforkindergarten.entity.Matching> matching,
			List<tn.esprit.spring.springbootforkindergarten.entity.Affectation> affectation, Set<Messaging> messages,
			Set<Posts> posts, Satisfaction satisfaction) {
		super();
		this.id = id;
		this.name = name;
		this.childname = childname;
		this.dateNaissance = dateNaissance;
		this.photo = photo;
		this.phone_number = phone_number;
		this.adress = adress;
		Kindergartenname = kindergartenname;
		Matching = matching;
		Affectation = affectation;
		this.messages = messages;
		this.posts = posts;
		this.satisfaction = satisfaction;
	}

	
	

	
	
	
}
