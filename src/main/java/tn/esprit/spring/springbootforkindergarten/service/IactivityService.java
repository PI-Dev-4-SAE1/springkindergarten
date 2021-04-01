package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Activity;


public interface IactivityService {
	 List<Activity> retrieveAllActivity(); 
	 Activity addActivity(Activity a); 
	 void deleteActivity(String id); 
	 Activity updateActivity(Activity a); 
	 Activity retrieveActivity(int id);
}
