package tn.esprit.spring.springbootforkindergarten.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table( name= "ReclamationActivity")
public class ReclamationActivity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String etat ;
	private String description ;
		@JsonBackReference ( value="activity")
		@ManyToOne(cascade = CascadeType.ALL)
	    private Activity activity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ReclamationActivity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReclamationActivity(int id, Activity activity, String etat, String description) {
		super();
		this.id = id;
		this.activity = activity;
		this.etat = etat;
		this.description = description;
	}
	@Override
	public String toString() {
		return "ReclamationActivity [id=" + id + ", etat=" + etat + ", description=" + description + ", activity="
				+ activity + "]";
	} 
	
	
}
