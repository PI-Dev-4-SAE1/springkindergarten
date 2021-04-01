package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springbootforkindergarten.entity.User;
import tn.esprit.spring.springbootforkindergarten.repository.activityRepository;
import tn.esprit.spring.springbootforkindergarten.repository.userRepository;



@Service
public class UserService implements IuserService{
	
	@Autowired
	userRepository userRepo;
	private static final Logger l = LogManager.getLogger(UserService.class);
	

	@Override
	public List<User> retrieveAllUser() {

		List<User> User = (List<User>) userRepo.findAll();
		for(User ac : User)
		{
			l.info("User +++ : "+ac);
		}
		return User;
		// TODO Auto-generated method stub
		
	}

	@Override
	public User addUser(User a) {
		l.info("Adding activity with ID: "+a.getId());
		return userRepo.save(a);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String id) {
		l.info("Deleting User with ID: "+id);
		userRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(User a) {
		l.info("Updating User with ID: "+a.getId());
		return this.userRepo.save(a);
		// TODO Auto-generated method stub
		
	}

	@Override
	public User retrieveUser(int id) {
		l.info("Retriving User with ID: "+id);
		return this.userRepo.findById(id).get();
		// TODO Auto-generated method stub
		
	}

}
