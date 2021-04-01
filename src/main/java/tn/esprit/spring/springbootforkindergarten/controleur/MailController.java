package tn.esprit.spring.springbootforkindergarten.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootforkindergarten.entity.UserSendMail;
import tn.esprit.spring.springbootforkindergarten.entity.childrengarden;
import tn.esprit.spring.springbootforkindergarten.service.MailService;

@ComponentScan
@RequestMapping
@RestController
public class MailController {
	
	@Autowired
	private MailService notificationService;

	@Autowired
	private UserSendMail user;
	@PostMapping("/send-mail/{parent_id}/{garden_id}")
	public String send(@PathVariable("garden_id") int childgarden,@PathVariable("parent_id")int par) {

		/*
		 * Creating a User with the help of User class that we have declared. Setting
		 * the First,Last and Email address of the sender.
		 */
		//Receiver's email address

		/*
		 * Here we will call sendEmail() for Sending mail to the sender.
		 */
		try {
			notificationService.sendEmail(childgarden,par);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}
	@PostMapping("/sendSatsifactionEmail/{parent_id}")
	public String sendSatsifactionEmail(@PathVariable("parent_id")int par) {

		/*
		 * Creating a User with the help of User class that we have declared. Setting
		 * the First,Last and Email address of the sender.
		 */
		//Receiver's email address

		/*
		 * Here we will call sendEmail() for Sending mail to the sender.
		 */
		try {
			notificationService.sendSatisfactionEmail(par);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}
}
