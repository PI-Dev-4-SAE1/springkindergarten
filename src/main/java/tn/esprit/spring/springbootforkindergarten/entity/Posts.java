package tn.esprit.spring.springbootforkindergarten.entity;

<<<<<<< HEAD
import java.util.Date;


import javax.persistence.*;
import java.util.Set;
=======

import javax.persistence.*;


>>>>>>> a5ed36d (2eme)

@Entity
@Table( name= "POSTS")
public class Posts {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	
	private String photo;
	private String description;
	
<<<<<<< HEAD
	@ManyToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private Set<Parents> parents;
=======
	@ManyToOne(cascade = CascadeType.ALL)
    private User User;
>>>>>>> a5ed36d (2eme)

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

<<<<<<< HEAD
	public Set<Parents> getParents() {
		return parents;
	}

	public void setParents(Set<Parents> parents) {
		this.parents = parents;
	}
=======
	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	
	
>>>>>>> a5ed36d (2eme)
	
	
	
	
}
