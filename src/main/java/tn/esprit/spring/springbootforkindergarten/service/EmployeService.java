package tn.esprit.spring.springbootforkindergarten.service;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Employe;
import tn.esprit.spring.springbootforkindergarten.repository.EmployeRepository;


@Service
public class EmployeService implements IemployeService{

	@Autowired
	EmployeRepository EmployeRepo;
	private static final Logger l = LogManager.getLogger(EmployeService.class);
	
	@Override
	public List<Employe> retrieveAllEmploye() {
		List<Employe> employees = (List<Employe>) EmployeRepo.findAll();
		for(Employe em : employees)
		{
			l.info("employe +++ : "+em);
		}
		return employees;
	}

	@Override
	public Employe addEmploye(Employe a) {
		l.info("Adding employe with ID: "+a.getId());
		return EmployeRepo.save(a);
	}

	@Override
	public void deleteEmploye(String id) {
		l.info("Deleting Employe with ID: "+id);
		EmployeRepo.deleteById(Integer.parseInt(id));
		
	}

	@Override
	public Employe updateEmploye(Employe a) {
		l.info("Updating Employe with ID: "+a.getId());
		return this.EmployeRepo.save(a);
	}

	@Override
	public Employe retrieveEmploye(int id) {
		l.info("Retriving Employe with ID: "+id);
		return this.EmployeRepo.findById(id).get();
	}

	@Override
	public List<Employe> retrieveEmployejob(String job) {
		List<Employe> employees = (List<Employe>) EmployeRepo.findByjob(job);
		for(Employe em : employees)
		{
			l.info("employe +++ : "+em);
		}
		return employees;
		
		
	}

	@Override
	public Employe retrievefirst_nameAndlast_name(String first_name, String last_name) {
		l.info("Retriving Employe with first_name and last_name: "+first_name,last_name);
		return this.EmployeRepo.findByfirst_nameAndlast_name(first_name,last_name);
	}

	@Override
	public List<Employe> retrieveemailAndpassword(String email, String password) {
		List<Employe> employees = (List<Employe>) EmployeRepo.findByemailAndpassword(email,password);
		for(Employe em : employees)
		{
			l.info("employe +++ : "+em);
		}
		return employees;
	}

	@Override
	public List<Employe> retrieveeverything(String email, String first_name, String job, String last_name,
			String password) {
		email='%'+email+'%';
		first_name='%'+first_name+'%';
		last_name='%'+last_name+'%';
		job='%'+job+'%';
		password='%'+password+'%';
		List<Employe> employees = (List<Employe>) EmployeRepo.findByeverything(email, first_name, job, last_name, password);
		for(Employe em : employees)
		{
			l.info("employe +++ : "+em);
		}
		return employees;
	}


		
	

	
	
	

}
