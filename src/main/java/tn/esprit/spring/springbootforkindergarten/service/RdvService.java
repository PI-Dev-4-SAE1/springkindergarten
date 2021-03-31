package tn.esprit.spring.springbootforkindergarten.service;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
		Date date1 = new Date(System.currentTimeMillis()) ;
		try{
		   String sDate1="2022-02-22T15";  
		     date1=new SimpleDateFormat("0:yyyy-MM-ddTHH").parse(sDate1);
		}catch(Exception e){
			l.info(e);
		}
		
		r.setDebut_rdv(date1);
		r.setFin_rdv(date1);		
		
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
	  public List<Rdv> searchrdv(String search) {
			
			
			List<Rdv> rdv_search =rdvRepo.searchrdv(search);
	
				return rdv_search;

			
		

		}
}
