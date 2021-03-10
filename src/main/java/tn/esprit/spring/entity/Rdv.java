package tn.esprit.spring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table( name= "RDV")
public class Rdv {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Temporal(TemporalType.DATE)
	private Date Debut_rdv;
	
	@Temporal(TemporalType.DATE)
	private Date Fin_rdv;
	
	private String description;
	
	@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Parents> parents;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private childrengarden childrengardens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDebut_rdv() {
		return Debut_rdv;
	}

	public void setDebut_rdv(Date debut_rdv) {
		Debut_rdv = debut_rdv;
	}

	public Date getFin_rdv() {
		return Fin_rdv;
	}

	public void setFin_rdv(Date fin_rdv) {
		Fin_rdv = fin_rdv;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Parents> getParents() {
		return parents;
	}

	public void setParents(Set<Parents> parents) {
		this.parents = parents;
	}

	public childrengarden getChildrengardens() {
		return childrengardens;
	}

	public void setChildrengardens(childrengarden childrengardens) {
		this.childrengardens = childrengardens;
	}
    
    
	
}
