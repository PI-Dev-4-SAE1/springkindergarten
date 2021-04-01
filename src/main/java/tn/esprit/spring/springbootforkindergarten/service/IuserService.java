package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;
import tn.esprit.spring.springbootforkindergarten.entity.User;


public interface IuserService {

	 List<User> retrieveAllUser(); 
	 User addUser(User a); 
	 void deleteUser(String id); 
	 User updateUser(User a); 
	 User retrieveUser(int id);
}
