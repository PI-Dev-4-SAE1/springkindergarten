package tn.esprit.spring.springbootforkindergarten.repository;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.childrengarden;

import java.sql.Date;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


@Repository
public interface ParentRepository extends JpaRepository<Parents,Integer > {
	
	@Query(value="select u.nom,u.price,u.location from user u where u.price <= :prices order by  u.price asc",nativeQuery=true)
	List<String> KinderGarten(@Param("prices") int prices);
	@Query(value="select u.nom,u.price,u.location from user u where u.city=:city or u.governate=:governate",nativeQuery=true)
	List<String> KinderGartenBYCityAndGovernate(@Param("city") String city,@Param("governate") String governate);
	@Query("SELECT c FROM childrengarden c ")
	List<childrengarden> KinderGartenBYLikes(Sort sort);
}
