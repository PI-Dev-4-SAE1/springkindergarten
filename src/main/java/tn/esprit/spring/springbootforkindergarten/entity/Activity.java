package tn.esprit.spring.springbootforkindergarten.entity;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Table( name= "ACTIVITY")
public class Activity {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String Description;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", Description=" + Description + ", dateNaissance=" + dateNaissance + "]";
	}
	public Activity( String description, Date dateNaissance) {
		Description = description;
		this.dateNaissance = dateNaissance;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Parents parent;
	
	@ManyToMany(mappedBy = "activities",cascade = CascadeType.ALL)
    private Set<childrengarden> childrengardens;


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

}
