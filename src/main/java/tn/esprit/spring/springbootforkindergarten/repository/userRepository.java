package tn.esprit.spring.springbootforkindergarten.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springbootforkindergarten.entity.User;


@Repository
public interface userRepository extends JpaRepository<User,Integer > {

	

}
