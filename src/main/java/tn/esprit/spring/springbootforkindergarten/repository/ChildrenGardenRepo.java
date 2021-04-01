package tn.esprit.spring.springbootforkindergarten.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootforkindergarten.entity.childrengarden;

@Repository
public interface ChildrenGardenRepo  extends JpaRepository<childrengarden, Integer>{
	

}
