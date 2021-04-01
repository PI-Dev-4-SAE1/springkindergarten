package tn.esprit.spring.springbootforkindergarten.entity;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table( name= "Consulatation")
public class Consulatation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String child_name; 
	@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Employe> name_doctor;
	private String namedoctor;
	@Temporal(TemporalType.DATE)
	private Date consultation_date;
	private String consultation_time;
	private String description;
	
	public Set<Employe> getName_doctor() {
		return name_doctor;
	}
	public void setName_doctor(Set<Employe> name_doctor) {
		this.name_doctor = name_doctor;
	}
	public String getNamedoctor() {
		return namedoctor;
	}
	public void setNamedoctor(String namedoctor) {
		this.namedoctor = namedoctor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChild_name() {
		return child_name;
	}
	public void setChild_name(String child_name) {
		this.child_name = child_name;
	}
	public Set<Employe> getEmploye() {
		return name_doctor;
	}
	
	public Date getConsultation_date() {
		return consultation_date;
	}
	public void setConsultation_date(Date consultation_date) {
		this.consultation_date = consultation_date;
	}
	public String getConsultation_time() {
		return consultation_time;
	}
	public void setConsultation_time(String consultation_time) {
		this.consultation_time = consultation_time;
	}
	
	@Override
	public String toString() {
		return "Consulatation [id=" + id + ", child_name=" + child_name + ", name_doctor=" + name_doctor
				+ ", consultation_date=" + consultation_date + ", consultation_time=" + consultation_time + "]";
	}
	
	
	
	
	
}
