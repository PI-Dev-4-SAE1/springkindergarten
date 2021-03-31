package tn.esprit.spring.springbootforkindergarten.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.springbootforkindergarten.entity.ReclamationActivity;

@Repository
public interface ReclamationActivityRepository extends CrudRepository<ReclamationActivity,Integer >{

}
