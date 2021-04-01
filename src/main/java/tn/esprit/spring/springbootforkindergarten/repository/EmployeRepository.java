package tn.esprit.spring.springbootforkindergarten.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;
import tn.esprit.spring.springbootforkindergarten.entity.Employe;
import java.util.List;

@Repository
public interface EmployeRepository extends CrudRepository<Employe,Integer >{
	
	public List<Employe> findByjob(String job);
	
	@Query("select e from Employe e where e.first_name=:first_name and e.last_name=:last_name")
	public Employe findByfirst_nameAndlast_name(@Param("first_name") String first_name, @Param("last_name") String last_name);
	
	@Query(value="select * from Employe e where e.email=:email and e.password=:password",nativeQuery = true)
	public List<Employe> findByemailAndpassword(@Param("email") String email, @Param("password") String password);
	
	@Query(value="select * from Employe e where e.email LIKE :email and e.first_name LIKE :first_name and e.job LIKE :job and e.last_name LIKE :last_name and e.password LIKE :password",nativeQuery = true)
	public List<Employe> findByeverything(@Param("email") String email,@Param("first_name") String first_name,@Param("job") String job,@Param("last_name") String last_name, @Param("password") String password);
	
	

}
