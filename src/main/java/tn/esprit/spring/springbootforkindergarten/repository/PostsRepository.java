package tn.esprit.spring.springbootforkindergarten.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootforkindergarten.entity.Comments;
import tn.esprit.spring.springbootforkindergarten.entity.Posts;



@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {


	Page<Posts> findByUserId(int userId, Pageable pageable);
	 Optional<Posts> findByIdAndUserId(Long id, int userId);
	 

}