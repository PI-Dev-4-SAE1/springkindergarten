package tn.esprit.spring.springbootforkindergarten.entity;


import java.util.List;

import javax.persistence.*;

@Entity
@Table( name= "ADMIN")
public class Admin extends User{
	


	//@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   // private int id;
	private String name;
	private String photo;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Admin( String name, String photo) {
		super();
		//this.id = id;
		this.name = name;
		this.photo = photo;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int id, String email, String password, int phone) {
		super(id, email, password, phone);
		// TODO Auto-generated constructor stub
	}
	
}

