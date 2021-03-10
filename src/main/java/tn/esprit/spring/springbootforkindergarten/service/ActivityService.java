package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Activity;
import tn.esprit.spring.springbootforkindergarten.repository.activityRepository;



@Service
public class ActivityService implements IactivityService{
	
	@Autowired
	activityRepository activityRepo;
	private static final Logger l = LogManager.getLogger(ActivityService.class);
	

	@Override
	public List<Activity> retrieveAllActivity() {

		List<Activity> activities = (List<Activity>) activityRepo.findAll();
		for(Activity ac : activities)
		{
			l.info("activity +++ : "+ac);
		}
		return activities;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Activity addActivity(Activity a) {
		l.info("Adding activity with ID: "+a.getId());
		return activityRepo.save(a);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteActivity(String id) {
		l.info("Deleting activity with ID: "+id);
		activityRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
		
	}

	@Override
	public Activity updateActivity(Activity a) {
		l.info("Updating activity with ID: "+a.getId());
		return this.activityRepo.save(a);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Activity retrieveActivity(int id) {
		l.info("Retriving activity with ID: "+id);
		return this.activityRepo.findById(id).get();
		// TODO Auto-generated method stub
		
	}

}
