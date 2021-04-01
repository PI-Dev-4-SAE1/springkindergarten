package tn.esprit.spring.springbootforkindergarten.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Interaction_type;
import tn.esprit.spring.springbootforkindergarten.entity.LikeKinderGarten;
import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.repository.ChildrenGardenRepo;
import tn.esprit.spring.springbootforkindergarten.repository.LikeKinderGartenRep;
import tn.esprit.spring.springbootforkindergarten.repository.ParentRepository;

@Service
public class KindergartenLikesSevice implements IKindergartenLikesSevice {
	@Autowired
	LikeKinderGartenRep kinder_rep;
	@Autowired
	ParentRepository parent_rep;
	@Autowired
	ChildrenGardenRepo child_rep;
	@Override
	public void AddLikesKinder(LikeKinderGarten likes,int parent_id,int kinder_id) {
		// TODO Auto-generated method stub
		Iterable<Parents> parent = parent_rep.findAll();
		for (Parents par : parent) {
			if (kinder_rep.LikesKinderGarten(parent_id, kinder_id)==0) {
				if (par.getId()==parent_id) {
					
					child_rep.findById(kinder_id).map(k ->{
						likes.setLike_type(Interaction_type.like);
						likes.setParent(par);
						likes.setChild(k);
						likes.setIs_Liked(true);
						kinder_rep.updatelikesKinder(kinder_id);
						return k;
						
					});
					
					kinder_rep.save(likes);
				}
				
			}
			
		}
		
		
	}
	@Override
	public void AddDisLikesKinder(LikeKinderGarten likes, int parent_id, int kinder_id) {
		// TODO Auto-generated method stub
		Iterable<Parents> parent = parent_rep.findAll();
		for (Parents par : parent) {
			if (kinder_rep.DisLikesKinderGarten(parent_id, kinder_id)==0) {
				if (par.getId()==parent_id) {
					
					child_rep.findById(kinder_id).map(k ->{
						likes.setLike_type(Interaction_type.dislike);
						likes.setParent(par);
						likes.setChild(k);
						likes.setIs_Liked(true);
						kinder_rep.updateDislikesKinder(kinder_id);
						return k;
						
					});
					
					kinder_rep.save(likes);
				}
				
			}
			
		}
		
		
	}

}
