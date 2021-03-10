package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.springbootforkindergarten.entity.Posts;
import tn.esprit.spring.springbootforkindergarten.repository.PostsRepository;



@Service
public class PostsService implements IPostsService{
	
	@Autowired
	PostsRepository PostsRepo;
	private static final Logger l = LogManager.getLogger(PostsService.class);
	

	@Override
	public List<Posts> retrieveAllPosts() {

		List<Posts> Postss = (List<Posts>) PostsRepo.findAll();
		for(Posts ac : Postss)
		{
			l.info("Posts +++ : "+ac);
		}
		return Postss;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Posts addPosts(Posts Po) {
		l.info("Adding Posts with ID: "+Po.getId());
		return PostsRepo.save(Po);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePosts(String id) {
		l.info("Deleting Posts with ID: "+id);
		PostsRepo.deleteById(Integer.parseInt(id));
		// TODO Auto-generated method stub
		
	}

	@Override
	public Posts updatePosts(Posts Po) {
		l.info("Updating Posts with ID: "+Po.getId());
		return this.PostsRepo.save(Po);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Posts retrievePosts(int id) {
		l.info("Retriving activity with ID: "+id);
		return this.PostsRepo.findById(id).get();
		// TODO Auto-generated method stub
		
	}

}
