package tn.esprit.spring.springbootforkindergarten.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.springbootforkindergarten.entity.LikeKinderGarten;
import tn.esprit.spring.springbootforkindergarten.service.KindergartenLikesSevice;

@RestController
public class LikeKinderGartenController {
	
	@Autowired
	KindergartenLikesSevice kinder_service;
	
	@PostMapping("AddLikeKinderGarten/{parent_id}/{kinder_id}")
	public void AddLikeKinderGarten(@PathVariable("parent_id")int parent_id,@PathVariable("kinder_id")int kinder_id,LikeKinderGarten like){
		kinder_service.AddLikesKinder(like, parent_id, kinder_id);
	}
	@PostMapping("AddDisLikeKinderGarten/{parent_id}/{kinder_id}")
	public void AddDisLikeKinderGarten(@PathVariable("parent_id")int parent_id,@PathVariable("kinder_id")int kinder_id,LikeKinderGarten like){
		kinder_service.AddDisLikesKinder(like, parent_id, kinder_id);
	}

}
