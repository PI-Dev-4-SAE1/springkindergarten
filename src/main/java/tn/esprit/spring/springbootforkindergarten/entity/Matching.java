

package tn.esprit.spring.springbootforkindergarten.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name= "Matching")

public class Matching {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JsonBackReference(value="Parent")
	private Parents Parent ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JsonBackReference(value="childrengarden")
	private childrengarden childrengarden ;			
	
	
	@Temporal (TemporalType.DATE)
	private Date dateDebutParent ;
	@Temporal (TemporalType.DATE)
	private Date dateFinParent ;
	@Temporal (TemporalType.DATE)
	private Date dateDebutGarden ;
	@Temporal (TemporalType.DATE)
	private Date dateFinGarden ;
	@Temporal (TemporalType.DATE)
	private Date dateDebutMatching ;
	@Temporal (TemporalType.DATE)
	private Date dateFinMatching ;
	
	private Boolean result ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Parents getParent() {
		return Parent;
	}

	public void setParent(Parents parent) {
		Parent = parent;
	}

	public childrengarden getChildrengarden() {
		return childrengarden;
	}

	public void setChildrengarden(childrengarden childrengarden) {
		this.childrengarden = childrengarden;
	}

	public Date getDateDebutParent() {
		return dateDebutParent;
	}

	public void setDateDebutParent(Date dateDebutParent) {
		this.dateDebutParent = dateDebutParent;
	}

	public Date getDateFinParent() {
		return dateFinParent;
	}

	public void setDateFinParent(Date dateFinParent) {
		this.dateFinParent = dateFinParent;
	}

	public Date getDateDebutGarden() {
		return dateDebutGarden;
	}

	public void setDateDebutGarden(Date dateDebutGarden) {
		this.dateDebutGarden = dateDebutGarden;
	}

	public Date getDateFinGarden() {
		return dateFinGarden;
	}

	public void setDateFinGarden(Date dateFinGarden) {
		this.dateFinGarden = dateFinGarden;
	}

	public Date getDateDebutMatching() {
		return dateDebutMatching;
	}

	public void setDateDebutMatching(Date dateDebutMatching) {
		this.dateDebutMatching = dateDebutMatching;
	}

	public Date getDateFinMatching() {
		return dateFinMatching;
	}

	public void setDateFinMatching(Date dateFinMatching) {
		this.dateFinMatching = dateFinMatching;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Matching(int id, Parents parent,
			tn.esprit.spring.springbootforkindergarten.entity.childrengarden childrengarden, Date dateDebutParent,
			Date dateFinParent, Date dateDebutGarden, Date dateFinGarden, Date dateDebutMatching, Date dateFinMatching,
			Boolean result) {
		super();
		this.id = id;
		Parent = parent;
		this.childrengarden = childrengarden;
		this.dateDebutParent = dateDebutParent;
		this.dateFinParent = dateFinParent;
		this.dateDebutGarden = dateDebutGarden;
		this.dateFinGarden = dateFinGarden;
		this.dateDebutMatching = dateDebutMatching;
		this.dateFinMatching = dateFinMatching;
		this.result = result;
	}

	public Matching() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Matching [id=" + id + ", Parent=" + Parent + ", childrengarden=" + childrengarden + ", dateDebutParent="
				+ dateDebutParent + ", dateFinParent=" + dateFinParent + ", dateDebutGarden=" + dateDebutGarden
				+ ", dateFinGarden=" + dateFinGarden + ", dateDebutMatching=" + dateDebutMatching + ", dateFinMatching="
				+ dateFinMatching + ", result=" + result + "]";
	}

	

	
	

	
	
	
}