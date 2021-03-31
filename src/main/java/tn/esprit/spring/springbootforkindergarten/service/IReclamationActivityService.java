package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;


import tn.esprit.spring.springbootforkindergarten.entity.ReclamationActivity;

public interface IReclamationActivityService {
	List<ReclamationActivity> retrieveAllReclamationActivity(); 
	ReclamationActivity addReclamationActivity(ReclamationActivity rea); 
	 void deleteReclamationActivity(String id); 
	 ReclamationActivity updateReclamationActivity(ReclamationActivity rea); 
	 ReclamationActivity retrieveReclamationActivity(int id);

}
