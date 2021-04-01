package tn.esprit.spring.springbootforkindergarten.service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;
import tn.esprit.spring.springbootforkindergarten.entity.UserSendMail;
import tn.esprit.spring.springbootforkindergarten.entity.childrengarden;
import tn.esprit.spring.springbootforkindergarten.repository.ChildrenGardenRepo;
import tn.esprit.spring.springbootforkindergarten.repository.ParentRepository;


@Service
public class MailService {
	@Autowired
	ChildrenGardenRepo child_rep;
	@Autowired
	ParentRepository parent_rep;
	private JavaMailSender javaMailSender;
	@Autowired
	public MailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
		
	}
	public void sendEmail(int childgarden,int par) throws MailException {

		/*
		 * This JavaMailSender Interface is used to send Mail in Spring Boot. This
		 * JavaMailSender extends the MailSender Interface which contains send()
		 * function. SimpleMailMessage Object is required because send() function uses
		 * object of SimpleMailMessage as a Parameter
		 */
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);
	    
	    mailSender.setUsername("fekihmeyssen@gmail.com");
	    mailSender.setPassword("meyssen12345678");
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
	    
	    
		SimpleMailMessage mail = new SimpleMailMessage();
		
		 child_rep.findById(childgarden).map(c ->{
	    	mail.setTo(c.getEmail_garden().toString());
	    	mail.setSubject("Inscription");
	    	parent_rep.findById(par).map(p -> {
	    		mail.setText("Bonjour, je suis " + p.getName()+" le parent de "+p.getChild_name()+" je veux inscrire mon enfant dans votre jardin "+c.getNom() +"\nPour me contacter:\n"+p.getPhone_number()+"\n"+p.getMail());
	    		return p;
	    	});
	    	
	    	
	    	
	    	return c;
	    });
		
		javaMailSender.send(mail);
		}
		
		public void sendSatisfactionEmail(int par) throws MailException {

			/*
			 * This JavaMailSender Interface is used to send Mail in Spring Boot. This
			 * JavaMailSender extends the MailSender Interface which contains send()
			 * function. SimpleMailMessage Object is required because send() function uses
			 * object of SimpleMailMessage as a Parameter
			 */
			JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		    mailSender.setHost("smtp.gmail.com");
		    mailSender.setPort(587);
		    
		    mailSender.setUsername("fekihmeyssen@gmail.com");
		    mailSender.setPassword("meyssen12345678");
		    
		    Properties props = mailSender.getJavaMailProperties();
		    props.put("mail.transport.protocol", "smtp");
		    props.put("mail.smtp.auth", "true");
		    props.put("mail.smtp.starttls.enable", "true");
		    props.put("mail.debug", "true");
		    
		    
			SimpleMailMessage mail = new SimpleMailMessage();
			
			
			parent_rep.findById(par).map(p -> {
				
				
				mail.setTo(p.getEmail());
		    	mail.setSubject("Satisfaction");
	    		mail.setText("Bonjour \n"+"Vous trouverez ci-joint la formulaire de satsifaction de notre jardin d'enfant ,je vous invité à le remplir  \n"+"https://docs.google.com/forms/d/e/1FAIpQLSfDGLwCEOY1kaYMwZ9WchEwtSipjWB5BQzBymCVKjfrzjRZWg/viewform?usp=sf_link");
	    		return p;
	    	});


		/*
		 * This send() contains an Object of SimpleMailMessage as an Parameter
		 */
		javaMailSender.send(mail);
	}

}
