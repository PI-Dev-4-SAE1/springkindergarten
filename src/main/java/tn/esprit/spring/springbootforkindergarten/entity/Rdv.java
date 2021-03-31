package tn.esprit.spring.springbootforkindergarten.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;

@Entity
@Table( name= "RDV")
public class Rdv {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@FutureOrPresent
	@Temporal(TemporalType.DATE)
	private Date Debut_rdv;
	@FutureOrPresent
	@Temporal(TemporalType.DATE)
	private Date Fin_rdv;
	
	private String description;
	
	@ManyToOne( cascade = CascadeType.ALL)
    private Parents parents;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private childrengarden childrengarden;

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

	public Parents getParents() {
		return parents;
	}

	public void setParents(Parents parents) {
		this.parents = parents;
	}

	public childrengarden getChildrengarden() {
		return childrengarden;
	}

	public void setChildrengarden(childrengarden childrengarden) {
		this.childrengarden = childrengarden;
	}

	public Rdv(int id, Date debut_rdv, Date fin_rdv, String description, Parents parents,
			tn.esprit.spring.springbootforkindergarten.entity.childrengarden childrengarden) {
		super();
		this.id = id;
		Debut_rdv = debut_rdv;
		Fin_rdv = fin_rdv;
		this.description = description;
		this.parents = parents;
		this.childrengarden = childrengarden;
	}

	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rdv [id=" + id + ", Debut_rdv=" + Debut_rdv + ", Fin_rdv=" + Fin_rdv + ", description=" + description
				+ ", parents=" + parents + ", childrengarden=" + childrengarden + "]";
	}

	

	
    
    
	
}
