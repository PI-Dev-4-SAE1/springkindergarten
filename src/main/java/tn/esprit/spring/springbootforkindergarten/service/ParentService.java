package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.Rdv;
import tn.esprit.spring.springbootforkindergarten.repository.ParentRepository;

@Service

public class ParentService implements IParentService{
	@Autowired
	ParentRepository ParentsRepo;
	private static final Logger l = LogManager.getLogger(ActivityService.class);

	
	
	@Override
	public Parents addParent(Parents p) {
		l.info("Adding Parent with ID: "+p.getId());
		return ParentsRepo.save(p);
	}



	@Override
	public List<Parents> retrieveAllParents() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteParents(String id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Parents updateParents(Parents p) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Parents retrieveParents(int id) {
		l.info("Retriving Parents with ID: "+id);
		return this.ParentsRepo.findById(id).get();
		// TODO Auto-generated method stub
	}

	
	
	
}
