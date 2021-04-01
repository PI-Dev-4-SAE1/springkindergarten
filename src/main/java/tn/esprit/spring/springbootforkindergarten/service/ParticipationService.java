package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.Participation;
import tn.esprit.spring.springbootforkindergarten.entity.User;
import tn.esprit.spring.springbootforkindergarten.repository.participationRepository;
import tn.esprit.spring.springbootforkindergarten.repository.userRepository;

@Service
public class ParticipationService  implements IParticipationService{
	@Autowired
	participationRepository participationRepo;
	@Autowired
	userRepository userRepo;
	
	private static final Logger l = LogManager.getLogger(RdvService.class);
	@Override
	public List<Participation> retrieveAllParticipations() {
		List<Participation> Participations = (List<Participation>) participationRepo.findAll();
		for(Participation p : Participations)
		{
			l.info("Participation +++ : "+p);
		}
		return Participations;
	}

	@Override
	public List<Participation> retrieveParticipationsByUser(int idUser) {
		/*Parents parent =  new Parents();
		parent = userRepo.findById(idUser).get();
		List<Participation> Participations = (List<Participation>) participationRepo.findByUser(user);
		for(Participation p : Participations)
		{
			l.info("Participation +++ : "+p);
		}
		return Participations;*/
		return null ;
	}

	@Override
	public Participation addParticipations(Participation e) {
		l.info("Adding Participations with ID: "+e.getId());
		return participationRepo.save(e);
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteParticipation(String id) {
		l.info("Deleting Participations with ID: "+id);
		participationRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub		
	}

}
