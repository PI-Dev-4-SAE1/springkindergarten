package tn.esprit.spring.springbootforkindergarten.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class LikeKinderGarten implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int like_id;
	@Column
	private boolean is_Liked;
	@Enumerated(value=EnumType.STRING)
	private Interaction_type like_type;
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Parents parent;
	
	@ManyToOne
	@JoinColumn(name="childrengarden_id")
	private childrengarden child;
	public int getLike_id() {
		return like_id;
	}
	public void setLike_id(int like_id) {
		this.like_id = like_id;
	}
	public boolean isIs_Liked() {
		return is_Liked;
	}
	public void setIs_Liked(boolean is_Liked) {
		this.is_Liked = is_Liked;
	}
	@JsonIgnore
	public Parents getParent() {
		return parent;
	}
	public void setParent(Parents parent) {
		this.parent = parent;
	}
	@JsonIgnore
	public childrengarden getChild() {
		return child;
	}
	public void setChild(childrengarden child) {
		this.child = child;
	}
	public LikeKinderGarten() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LikeKinderGarten(int like_id, boolean is_Liked, Parents parent, childrengarden child) {
		super();
		this.like_id = like_id;
		this.is_Liked = is_Liked;
		this.parent = parent;
		this.child = child;
	}
	public LikeKinderGarten(boolean is_Liked, Parents parent, childrengarden child) {
		super();
		this.is_Liked = is_Liked;
		this.parent = parent;
		this.child = child;
	}
	public Interaction_type getLike_type() {
		return like_type;
	}
	public void setLike_type(Interaction_type like_type) {
		this.like_type = like_type;
	}
	public LikeKinderGarten(boolean is_Liked, Interaction_type like_type, Parents parent, childrengarden child) {
		super();
		this.is_Liked = is_Liked;
		this.like_type = like_type;
		this.parent = parent;
		this.child = child;
	}
	
	

}
