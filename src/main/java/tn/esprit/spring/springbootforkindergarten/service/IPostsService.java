package tn.esprit.spring.springbootforkindergarten.service;

import java.util.List;

import tn.esprit.spring.springbootforkindergarten.entity.Posts;

public interface IPostsService {

	List<Posts> retrieveAllPosts();
	Posts addPosts(Posts Po);
	Posts retrievePosts(int id);
	Posts updatePosts(Posts Po);
    void deletePosts(String id);

}
