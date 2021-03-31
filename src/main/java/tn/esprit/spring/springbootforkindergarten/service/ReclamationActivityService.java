package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.ReclamationActivity;
import tn.esprit.spring.springbootforkindergarten.repository.ReclamationActivityRepository;


@Service
public class ReclamationActivityService  implements IReclamationActivityService{
	@Autowired
	ReclamationActivityRepository ReclamationActivityRepo;
	private static final Logger l = LogManager.getLogger(ActivityService.class);
	@Override
	public List<ReclamationActivity> retrieveAllReclamationActivity() {
			List<ReclamationActivity> reclamationactivities = (List<ReclamationActivity>) ReclamationActivityRepo.findAll();
		for(ReclamationActivity rea : reclamationactivities)
		{
			l.info("ReclamationActivity +++ : "+rea);
		}
		return reclamationactivities;
		// TODO Auto-generated method stub
	
	}
	@Override
	public ReclamationActivity addReclamationActivity(ReclamationActivity rea) {
		l.info("Adding ReclamationActivity with ID: "+rea.getId());
		return ReclamationActivityRepo.save(rea);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteReclamationActivity(String id) {
		l.info("Deleting ReclamationActivity with ID: "+id);
		 ReclamationActivityRepo.deleteById(Integer.parseInt(id));

		// TODO Auto-generated method stub
		
	}
	@Override
	public ReclamationActivity updateReclamationActivity(ReclamationActivity rea) {
		l.info("Updating ReclamationActivity with ID: "+rea.getId());
		return this.ReclamationActivityRepo.save(rea);
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public ReclamationActivity retrieveReclamationActivity(int id) {
		l.info("Retriving ReclamationActivity with ID: "+id);
		return this.ReclamationActivityRepo.findById(id).get();
		// TODO Auto-generated method stub
	
	}
	
	
}
