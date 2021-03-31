package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.RatingActivity;

public interface iRatingActivityService {
	List<RatingActivity> retrieveAllRatingActivity(); 
	RatingActivity addRatingActivity(RatingActivity ra); 
	 void deleteRatingActivity(String id); 
	 RatingActivity updateRatingActivity(RatingActivity ra); 
	 RatingActivity retrieveRatingActivity(int id);

}
