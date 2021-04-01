package tn.esprit.spring.springbootforkindergarten.service;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.childrengarden;
import tn.esprit.spring.springbootforkindergarten.repository.ChildrenGardenRepo;
import tn.esprit.spring.springbootforkindergarten.repository.ParentRepository;


@Service
public class ParentsService  implements IParentService{
	@Autowired
	ParentRepository parentRepo;
	@Autowired
	ChildrenGardenRepo rep;
	private static final Logger l = LogManager.getLogger(ActivityService.class);

	
	
	@Override
	public List<Parents> retrieveAllParents() {

		List<Parents> parents = (List<Parents>) parentRepo.findAll();
		for(Parents ac : parents)
		{
			l.info("activity +++ : "+ac);
		}
		return parents;
		// TODO Auto-generated method stub
	}
	
	
	/*@Override
	public Parents addParents(Parents p) throws IOException {
		MultipartFile multi;
		String filename = StringUtils.cleanPath(multi.getOriginalFilename());
		p.setPhoto(filename);
		Parents par = parentRepo.save(p);
		String uploaddir = "user-photos/" + par.getId();
		UploadFile.saveFile(uploaddir, filename, image);
		l.info("Adding parents with ID: "+p.getId());
		return p;
		// TODO Auto-generated method stub
		
	}*/

	/*@Override
	public void deleteParents(String id) {
		l.info("Deleting parent with ID: "+id);
		parentRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
	}*/
	
	@Override
	public Parents updateParents(Parents p) {
		l.info("Updating Parent with ID: "+p.getId());
		return this.parentRepo.save(p);
		// TODO Auto-generated method stub	
	}
	
	@Override
	public Parents retrieveParents(int id) {
		l.info("Retriving Parent with ID: "+id);
		return this.parentRepo.findById(id).get();
		// TODO Auto-generated method stub	
	}


	@Override
	public List<String> KinderGarten(int price) {
		// TODO Auto-generated method stub
		return parentRepo.KinderGarten(price);
	}


	@Override
	public List<String> KinderGartenBYCityAndGovernate(String city, String governate) {
		// TODO Auto-generated method stub
		return parentRepo.KinderGartenBYCityAndGovernate(city, governate);
	}


	@Override
	public List<childrengarden> KinderGartenByLikes() {
		// TODO Auto-generated method stub
		return parentRepo.KinderGartenBYLikes(Sort.by(Sort.Direction.DESC, "count_like"));
	}
	
	
	@Override
	public java.util.Date InscriptionDate(int id) {
		// TODO Auto-generated method stub
		Parents p = this.parentRepo.findById(id).get();
		return p.getDate_inscrit();
	}
	
	
	
	
	
}
