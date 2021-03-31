package tn.esprit.spring.springbootforkindergarten.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name= "RatingActivity")
public class RatingActivity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private float note ; 
	
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

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public RatingActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RatingActivity(int id, float note, String description, Activity activity) {
		super();
		this.id = id;
		this.note = note;
		this.description = description;
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "RatingActivity [id=" + id + ", note=" + note + ", description=" + description + ", activity=" + activity
				+ "]";
	}
	

}
