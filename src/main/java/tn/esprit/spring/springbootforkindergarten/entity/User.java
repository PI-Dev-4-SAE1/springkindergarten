package tn.esprit.spring.springbootforkindergarten.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name= "User")
public class User implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String nom;
	
	private String prenom;
	
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
