package tn.esprit.spring.entity;



import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name= "RECLAMATION")
public class Reclamation {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String Reason;
	private String Detail;
	private Date dateofcreation;
	private String State;
	
	@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Parents> parents;
	
	@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<childrengarden> childrengardens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getDetail() {
		return Detail;
	}

	public void setDetail(String detail) {
		Detail = detail;
	}

	public Date getDateofcreation() {
		return dateofcreation;
	}

	public void setDateofcreation(Date dateofcreation) {
		this.dateofcreation = dateofcreation;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Set<Parents> getParents() {
		return parents;
	}

	public void setParents(Set<Parents> parents) {
		this.parents = parents;
	}

	public Set<childrengarden> getChildrengardens() {
		return childrengardens;
	}

	public void setChildrengardens(Set<childrengarden> childrengardens) {
		this.childrengardens = childrengardens;
	}

	
	
	
	
	
}
