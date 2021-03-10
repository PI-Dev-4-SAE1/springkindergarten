package tn.esprit.spring.entity;

import java.util.Date;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name= "POSTS")
public class Posts {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	
	private String photo;
	private String description;
	
	@ManyToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private Set<Parents> parents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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
	
	
	
	
}
