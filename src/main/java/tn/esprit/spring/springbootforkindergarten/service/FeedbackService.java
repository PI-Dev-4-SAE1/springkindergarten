package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.springbootforkindergarten.entity.Feedback;
import tn.esprit.spring.springbootforkindergarten.repository.feedbackRepository;

@Service
public class FeedbackService  implements IfeedbackService{
	@Autowired
	feedbackRepository feedbackRepo;
	private static final Logger l = LogManager.getLogger(FeedbackService.class);
	@Override
	public List<Feedback> retrieveAllFeedback() {
		List<Feedback> feedbackk = (List<Feedback>) feedbackRepo.findAll();
		for(Feedback f : feedbackk)
		{
			l.info("feedback +++ : "+f);
		}
		return feedbackk;
		// TODO Auto-generated method stub 
		
	}
	@Override
	public Feedback addFeedback(Feedback f) {
		l.info("Adding feedbackk with ID: "+f.getId());
		return feedbackRepo.save(f);
		// TODO Auto-generated method stub
	
	}
	@Override
	public void deleteFeedback(String id) {
		l.info("Deleting feedback with ID: "+id);
		feedbackRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
		
	}
	@Override
	public Feedback updateFeedback(Feedback f) {
		l.info("Updating feedbackk with ID: "+f.getId());
		return this.feedbackRepo.save(f);
		// TODO Auto-generated method stub
		
	}
	@Override
	public Feedback retrieveFeedback(int id) {
		l.info("Retriving feedback with ID: "+id);
		return this.feedbackRepo.findById(id).get();
		// TODO Auto-generated method stub
		
	}
}
