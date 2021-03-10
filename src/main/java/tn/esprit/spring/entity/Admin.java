package tn.esprit.spring.entity;


import javax.persistence.*;

@Entity
@Table( name= "ADMIN")
public class Admin extends User{
	
	public Admin(int id, String email, String password, int phone) {
		super(id, email, password, phone);
		
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String name;
	private String photo;
	
	
}

