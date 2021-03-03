package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.springbootforkindergarten.entity.Rdv;
import tn.esprit.spring.springbootforkindergarten.repository.rdvrepository;

@Service
public class RdvService implements IRdvService{
	@Autowired
	rdvrepository rdvRepo;
	private static final Logger l = LogManager.getLogger(RdvService.class);
	@Override
	public List<Rdv> retrieveAllRdv() {
		List<Rdv> rendezvous = (List<Rdv>) rdvRepo.findAll();
		for(Rdv r : rendezvous)
		{
			l.info("rendezvous +++ : "+r);
		}
		return rendezvous;
		// TODO Auto-generated method stub
		
	}
	@Override
	public Rdv addRdv(Rdv r) {
		l.info("Adding rendezvous with ID: "+r.getId());
		return rdvRepo.save(r);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteRdv(String id) {
		l.info("Deleting rendezvous with ID: "+id);
		rdvRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
		
	}
	@Override
	public Rdv updateRdv(Rdv r) {
		l.info("Updating rendezvous with ID: "+r.getId());
		return this.rdvRepo.save(r);
	}
		// TODO Auto-generated method stub
		
	@Override
	public Rdv retrieveRdv(int id) {
		// TODO Auto-generated method stub
		l.info("Retriving rendezvous with ID: "+id);
		return this.rdvRepo.findById(id).get();
	}
}
