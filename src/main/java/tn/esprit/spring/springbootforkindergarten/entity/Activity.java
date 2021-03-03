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
	
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Parents parent;
	
	@ManyToMany(mappedBy = "activities",cascade = CascadeType.ALL)
    private Set<childrengarden> childrengardens;

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

	public Parents getParent() {
		return parent;
	}

	public void setParent(Parents parent) {
		this.parent = parent;
	}

	public Set<childrengarden> getChildrengardens() {
		return childrengardens;
	}

	public void setChildrengardens(Set<childrengarden> childrengardens) {
		this.childrengardens = childrengardens;
	}

	public Activity(int id, String nom, String description, Date date, Parents parent,
			Set<childrengarden> childrengardens) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.parent = parent;
		this.childrengardens = childrengardens;
	}

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", nom=" + nom + ", description=" + description + ", date=" + date + ", parent="
				+ parent + ", childrengardens=" + childrengardens + "]";
	}


	
	
}
