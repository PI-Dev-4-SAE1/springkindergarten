package tn.esprit.spring.springbootforkindergarten.entity;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Table( name= "ACTIVITY")
public class Activity {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String nom ;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	
	
	


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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}




	
	
}
