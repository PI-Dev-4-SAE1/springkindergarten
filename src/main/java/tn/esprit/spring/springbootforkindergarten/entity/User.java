package tn.esprit.spring.springbootforkindergarten.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.List;

@Entity
@Table( name= "USERS")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

    private String email;
    private String password;
    private int phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String email, String password, int phone) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
  
	
	
	
}
