package tn.esprit.spring.springbootforkindergarten.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@Entity
@Table( name= "Affectation")
public class Affectation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@JsonBackReference(value="parent")
	@ManyToOne
    private Parents parent;
	@JsonBackReference(value="activity")
	@ManyToOne
	
    private Activity activity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Parents getParent() {
		return parent;
	}
	public void setParent(Parents parent) {
		this.parent = parent;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public Affectation(int id, Parents parent, Activity activity) {
		super();
		this.id = id;
		this.parent = parent;
		this.activity = activity;
	}
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
