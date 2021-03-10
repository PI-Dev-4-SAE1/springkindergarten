package tn.esprit.spring.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name= "USER")
public class User implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" 
	+ email + ", password=" + password + ", "
			+ "phone=" + phone + "]";
	}
	
	public User(int id, String email, String password, int phone) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	
    
    
	
}
