package tn.esprit.spring.entity;


import java.util.Date;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name= "MESSAGING")
public class Messaging {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String sender;
	private String reciever;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	private String description;
	
	
	@ManyToMany(mappedBy = "messages",cascade = CascadeType.ALL)
    private Set<Parents> parents;
	
	@OneToMany(mappedBy = "message",cascade = CascadeType.ALL)
    private Set<childrengarden> childrengarden;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReciever() {
		return reciever;
	}

	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Parents> getParents() {
		return parents;
	}

	public void setParents(Set<Parents> parents) {
		this.parents = parents;
	}

	public Set<childrengarden> getChildrengarden() {
		return childrengarden;
	}

	public void setChildrengarden(Set<childrengarden> childrengarden) {
		this.childrengarden = childrengarden;
	}
	
}
