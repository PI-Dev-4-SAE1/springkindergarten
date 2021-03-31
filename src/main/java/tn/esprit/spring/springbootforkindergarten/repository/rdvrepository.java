package tn.esprit.spring.springbootforkindergarten.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.springbootforkindergarten.entity.Rdv;

@Repository
public interface rdvrepository extends JpaRepository<Rdv,Integer >{
	
	@Query("SELECT m FROM Rdv m WHERE m.description LIKE %:search% ")
	List<Rdv> searchrdv(@Param("search") String search);

}
