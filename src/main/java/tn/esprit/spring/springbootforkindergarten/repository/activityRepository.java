package tn.esprit.spring.springbootforkindergarten.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootforkindergarten.entity.Activity;


@Repository
public interface activityRepository extends CrudRepository<Activity,Integer > {

}
