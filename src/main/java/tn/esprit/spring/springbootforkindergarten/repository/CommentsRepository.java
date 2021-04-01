package tn.esprit.spring.springbootforkindergarten.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootforkindergarten.entity.Comments;
import tn.esprit.spring.springbootforkindergarten.entity.User;

import java.util.Optional;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
    Page<Comments> findByPostsId(Long postsId, Pageable pageable);
    Optional<Comments> findByIdAndPostsId(Long id, Long postsId);
}