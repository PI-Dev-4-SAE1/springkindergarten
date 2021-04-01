package tn.esprit.spring.springbootforkindergarten.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.childrengarden;

public interface IParentService {
	List<Parents> retrieveAllParents(); 
	//Parents addParents(Parents p) throws IOException; 
	 //void deleteParents(String id); 
	 Parents updateParents(Parents p); 
	 Parents retrieveParents(int id);
	 List<String> KinderGarten(int price);
	 List<String> KinderGartenBYCityAndGovernate(String city,String governate);
	 List<childrengarden> KinderGartenByLikes();
	 Date InscriptionDate( int id ) ;
}
