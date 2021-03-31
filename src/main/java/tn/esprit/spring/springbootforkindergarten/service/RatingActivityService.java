package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Activity;
import tn.esprit.spring.springbootforkindergarten.entity.RatingActivity;
import tn.esprit.spring.springbootforkindergarten.repository.RatingActivityRepository;


@Service
public class RatingActivityService  implements iRatingActivityService {
	@Autowired
	RatingActivityRepository RatingActivityRepo;
	private static final Logger l = LogManager.getLogger(ActivityService.class);
	@Override
	public List<RatingActivity> retrieveAllRatingActivity() {
		List<RatingActivity> RatingActivitys = (List<RatingActivity>) RatingActivityRepo.findAll();
		for(RatingActivity ra : RatingActivitys)
		{
			l.info("RatingActivity +++ : "+ra);
		}
		return RatingActivitys;
		// TODO Auto-generated method stub
	
	}
	@Override
	public RatingActivity addRatingActivity(RatingActivity ra) {
		l.info("Adding RatingActivity with ID: "+ra.getId());
		return RatingActivityRepo.save(ra);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteRatingActivity(String id) {
		l.info("Deleting RatingActivity with ID: "+id);
		RatingActivityRepo.deleteById(Integer.parseInt(id));

		// TODO Auto-generated method stub
		
	}
	@Override
	public RatingActivity updateRatingActivity(RatingActivity ra) {
		l.info("Updating RatingActivity( with ID: "+ra.getId());
		return this.RatingActivityRepo.save(ra);
		// TODO Auto-generated method stub
		
	}
	@Override
	public RatingActivity retrieveRatingActivity(int id) {
		l.info("Retriving RatingActivity with ID: "+id);
		return this.RatingActivityRepo.findById(id).get();
		// TODO Auto-generated method stub
		
	}
	
}
