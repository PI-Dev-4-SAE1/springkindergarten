package tn.esprit.spring.springbootforkindergarten.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.Participation;


@Repository
public interface participationRepository  extends CrudRepository<Participation,Integer > {
    public List<Participation> findByParent( Parents parent);

}
