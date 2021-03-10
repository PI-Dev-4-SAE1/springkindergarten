package tn.esprit.spring.springbootforkindergarten.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springbootforkindergarten.entity.Posts;


@Repository
public interface PostsRepository extends CrudRepository<Posts,Integer > {

}
