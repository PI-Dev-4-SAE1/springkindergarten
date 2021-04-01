package tn.esprit.spring.springbootforkindergarten.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.springbootforkindergarten.entity.LikeKinderGarten;

@Repository
public interface LikeKinderGartenRep extends CrudRepository<LikeKinderGarten, Integer> {
	@Query(value="select count(*) from like_kinder_garten l where l.parent_id= :parent_id and l.childrengarden_id= :childrengarden_id and is_liked=1 and l.like_type = 'likes'",nativeQuery=true)
	int LikesKinderGarten(@Param("parent_id") int parent_id,@Param("childrengarden_id") int childrengarden_id);
	@Query(value="select count(*) from like_kinder_garten l where l.parent_id= :parent_id and l.childrengarden_id= :childrengarden_id and is_liked=1 and l.like_type = 'dislikes'",nativeQuery=true)
	int DisLikesKinderGarten(@Param("parent_id") int parent_id,@Param("childrengarden_id") int childrengarden_id);
	@Transactional
	@Modifying
	@Query(value="UPDATE user u SET u.count_like = u.count_like +1 WHERE u.id = :id",nativeQuery=true)
	void updatelikesKinder(@Param("id") int id);
	@Transactional
	@Modifying
	@Query(value="UPDATE user u SET u.count_dislike = u.count_dislike +1 WHERE u.id = :id",nativeQuery=true)
	void updateDislikesKinder(@Param("id") int id);
	
}
