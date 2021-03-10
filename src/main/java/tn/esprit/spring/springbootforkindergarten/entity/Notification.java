package tn.esprit.spring.springbootforkindergarten.entity;

import java.util.Date;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name= "NOTIFICATION")
public class Notification {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Notification(int id) {
		super();
		this.id = id;
	}

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
