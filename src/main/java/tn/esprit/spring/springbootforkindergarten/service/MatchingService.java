package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Activity;
import tn.esprit.spring.springbootforkindergarten.entity.Matching;
import tn.esprit.spring.springbootforkindergarten.repository.MatchingRepository;
import tn.esprit.spring.springbootforkindergarten.repository.activityRepository;

@Service
public class MatchingService  implements IMatchingService {

	
	@Autowired
	MatchingRepository MatchingRepo;
	private static final Logger l = LogManager.getLogger(ActivityService.class);

	@Override
	public Matching addMatching(Matching m) {
		l.info("Adding Matching  with ID: "+m.getId());
		return MatchingRepo.save(m);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MatchingFunction(int id) {
		Matching m =this.MatchingRepo.findById(id).get();
		l.info(" Matching : "+m);

		if((m.getDateDebutGarden()!=null)&&(m.getDateFinGarden()!=null)&&(m.getDateDebutParent()!=null)&&(m.getDateFinParent()!=null))
		{
			if ((m.getDateDebutGarden().before(m.getDateFinParent())&&(m.getDateFinGarden().before(m.getDateDebutParent()))) ||(m.getDateDebutGarden().after(m.getDateFinParent())&&(m.getDateFinGarden().after(m.getDateDebutParent()))))
			{
				m.setResult(false);
				l.info("Updating Matching 2: "+m);

			}
			else
			{
				if (m.getDateDebutGarden().before(m.getDateDebutParent()))
				{
					m.setDateDebutMatching(m.getDateDebutParent());
				}
				else
				{
					m.setDateDebutMatching(m.getDateDebutGarden());
				}
				if (m.getDateFinGarden().before(m.getDateFinParent()))
				{
					m.setDateFinMatching(m.getDateFinGarden());
				}
				else
				{
					m.setDateFinMatching(m.getDateFinParent());
				}
				m.setResult(true);
				l.info("Updating Matching 1: "+m);

			}
			MatchingRepo.save(m);

		}
			
	}

	@Override
	public Matching updateMatching(Matching m) {
		
		l.info("Updating Matching with ID: "+m.getId());
		return this.MatchingRepo.save(m);
		// TODO Auto-generated method stub
	
	}

	@Override
	public List<Matching> retrieveAllMatching() {
		List<Matching> Matchings = (List<Matching>) MatchingRepo.findAll();
		for(Matching ms  : Matchings)
		{
			l.info("Matching +++ : "+ms);
		}
		return  Matchings;
		// TODO Auto-generated method stub
		
	}

	
}
