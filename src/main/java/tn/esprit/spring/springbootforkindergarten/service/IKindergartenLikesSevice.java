package tn.esprit.spring.springbootforkindergarten.service;

import tn.esprit.spring.springbootforkindergarten.entity.LikeKinderGarten;

public interface IKindergartenLikesSevice {
	
	public void AddLikesKinder(LikeKinderGarten likes,int parent_id,int kinder_id);
	public void AddDisLikesKinder(LikeKinderGarten likes,int parent_id,int kinder_id);

}
