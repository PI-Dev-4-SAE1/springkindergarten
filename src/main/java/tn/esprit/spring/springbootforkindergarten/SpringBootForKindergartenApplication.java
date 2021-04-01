package tn.esprit.spring.springbootforkindergarten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootForKindergartenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootForKindergartenApplication.class, args);
	}

}
