package tn.esprit.spring.springbootforkindergarten.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootforkindergarten.entity.Affectation;
import tn.esprit.spring.springbootforkindergarten.entity.Parents;

@Repository
public interface AffectationRepository extends CrudRepository <Affectation,Integer >{
	List<Affectation> findByParent(Parents p);

}
