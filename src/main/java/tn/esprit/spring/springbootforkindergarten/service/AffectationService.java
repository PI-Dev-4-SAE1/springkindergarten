package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Activity;
import tn.esprit.spring.springbootforkindergarten.entity.Affectation;
import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.repository.AffectationRepository;
import tn.esprit.spring.springbootforkindergarten.repository.ParentRepository;


@Service
public class AffectationService implements IAffectationService{
	
	@Autowired
	AffectationRepository AffectationRepo;
	@Autowired
	ParentRepository ParentRepo;
	private static final Logger l = LogManager.getLogger(ActivityService.class);
	@Override
	public List<Affectation> retrieveAllAffectation() {
		List<Affectation> Affectationn = (List<Affectation>) AffectationRepo.findAll();
		for(Affectation af : Affectationn)
		{
			l.info("Affectation +++ : "+af);
		}
		return Affectationn;
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Affectation> MesAffectation(int idParent) {
		Parents p = ParentRepo.findById(idParent).get();
		List<Affectation> Affectationn = (List<Affectation>) AffectationRepo.findByParent(p);
		for(Affectation af : Affectationn)
		{
			l.info("Affectation +++ : "+af);
		}
		return Affectationn;
	}
	@Override
	public Affectation addAffectation(Affectation a) {
		l.info("Adding Affectation with ID: "+a.getId());
		return AffectationRepo.save(a);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAffectation(String id) {
		l.info("Deleting Affectation with ID: "+id);
		AffectationRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
		
	}

}
