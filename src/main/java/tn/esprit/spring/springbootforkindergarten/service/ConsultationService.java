package tn.esprit.spring.springbootforkindergarten.service;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import tn.esprit.spring.springbootforkindergarten.entity.Consulatation;
import tn.esprit.spring.springbootforkindergarten.entity.Employe;
import tn.esprit.spring.springbootforkindergarten.repository.ConsultationRepository;
import tn.esprit.spring.springbootforkindergarten.repository.EmployeRepository;


@Service
public class ConsultationService implements IconsultationService {

	@Autowired
	ConsultationRepository ConsultationRepo;
	private static final Logger l = LogManager.getLogger(ConsultationService.class);
	
	//convert date to ...
	Calendar calendar = Calendar.getInstance();
	
	
	
	@Override
	public List<Consulatation> retrieveAllConsultation() {
		
		List<Consulatation> consult = (List<Consulatation>) ConsultationRepo.findAll();
		for(Consulatation c : consult)
		{
			l.info("consultation +++ : "+c);
		}
		return consult;
	}

	@Override
	public Consulatation addConsultation(Consulatation a) {
		l.info("Adding consultation with ID: "+a.getId());
		return ConsultationRepo.save(a);
	}

	@Override
	public void deleteConsultation(String id) {
		l.info("Deleting consultation with ID: "+id);
		ConsultationRepo.deleteById(Integer.parseInt(id));
		
	}

	@Override
	public Consulatation updateConsultation(Consulatation a) {
		l.info("Updating consultation with ID: "+a.getId());
		return this.ConsultationRepo.save(a);
	}

	@Override
	public Consulatation retrieveConsultation(int id) {
		l.info("Retriving consultation with ID: "+id);
		return this.ConsultationRepo.findById(id).get();
	}

	@Override
	public Consulatation addautoConsultation(Consulatation a) {
		
		
		List<Consulatation> consult = (List<Consulatation>) ConsultationRepo.findAll();
		
		for(Consulatation c : consult)
		{
			
			l.info("consultation +++ : "+c);

			
			String b= c.getConsultation_date().toString();
			String dateParts[] = b.split("-");
			  
	        // Getting day, month, and year 
	        // from date of database
	        String year = dateParts[0];
	        String month = dateParts[1];
	        String day = dateParts[2];
	  
	     
	        
	        
	        /// today
	        LocalDate t = LocalDate.now();
	        
	        
	        
	        String today=t.toString();
	        
	        String todayParts[] = today.split("-");
			  
	        // Getting today day, month, and year 
	        // from date of database
	        String todayyear = todayParts[0];
	        String todaymonth = todayParts[1];
	        String todayday = todayParts[2];

	        
	        int jj=Integer.parseInt(day);
	        int tjj=Integer.parseInt(todayday);
	        int mm=Integer.parseInt(month);
	        int tmm=Integer.parseInt(todaymonth);
	        int yyyy=Integer.parseInt(year);
	        int tyyyy=Integer.parseInt(todayyear);
	        
	        boolean affected=false;
			int atime=8;
			int aday=1;
			int amonth=1;
			int ayear=1;
			
			int cnst=Integer.parseInt(c.getConsultation_time());
			
	        while(affected==false)
	        {
	        	if((jj==tjj)&&(mm==tmm)&&(yyyy==tyyyy))
	        	{
	        		if(cnst!=9)
	        		{
	        			atime=9;
	        			String m="9";;
	        			a.setConsultation_time(m);
	        			
	        			String sDate1=String.valueOf(tjj)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        			
	        		}
	        		else if(cnst!=10&&cnst!=9)
	        		{
	        			atime=10;
	        			String m="10";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=11)
	        		{
	        			atime=11;
	        			String m="11";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=12)
	        		{
	        			atime=12;
	        			String m="12";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		
	        	}
	        	else if((jj==tjj+1)&&(mm==tmm)&&(yyyy==tyyyy))
	        	{
	        		if(cnst!=9)
	        		{
	        			atime=9;
	        			String m="9";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+1)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=10)
	        		{
	        			atime=10;
	        			String m="10";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+1)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=11)
	        		{
	        			atime=11;
	        			String m="11";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+1)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=12)
	        		{
	        			atime=12;
	        			String m="12";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+1)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		
        			
	        		
	        	}
	        	else if((jj==tjj+2)&&(mm==tmm)&&(yyyy==tyyyy))
	        	{
	        		if(cnst!=9)
	        		{
	        			atime=9;
	        			String m="9";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+2)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=10)
	        		{
	        			atime=10;
	        			String m="10";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+2)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=11)
	        		{
	        			atime=11;
	        			String m="11";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+2)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=12)
	        		{
	        			atime=12;
	        			String m="12";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+2)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		
	        		
	        	}
	        	else if((jj==tjj+3)&&(mm==tmm)&&(yyyy==tyyyy))
	        	{
	        		if(cnst!=9)
	        		{
	        			atime=9;
	        			String m="9";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+3)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=10)
	        		{
	        			atime=10;
	        			String m="10";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+3)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=11)
	        		{
	        			atime=11;
	        			String m="11";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+3)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=12)
	        		{
	        			atime=12;
	        			String m="12";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+3)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		aday=tjj+3;
        			amonth=tmm;
        			ayear=tyyyy;
	        	}
	        	else if((jj==tjj+4)&&(mm==tmm)&&(yyyy==tyyyy))
	        	{
	        		if(cnst!=9)
	        		{
	        			atime=9;
	        			String m="9";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+4)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=10)
	        		{
	        			atime=10;
	        			String m="10";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+4)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=11)
	        		{
	        			atime=11;
	        			String m="11";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+4)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=12)
	        		{
	        			atime=12;
	        			String m="12";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+4)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		aday=tjj+4;
        			amonth=tmm;
        			ayear=tyyyy;
	        		
	        	}
	        	else if((jj==tjj+5)&&(mm==tmm)&&(yyyy==tyyyy))
	        	{
	        		if(cnst!=9)
	        		{
	        			atime=9;
	        			String m="9";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+5)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=10)
	        		{
	        			atime=10;
	        			String m="10";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+5)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=11)
	        		{
	        			atime=11;
	        			String m="11";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+5)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=12)
	        		{
	        			atime=12;
	        			String m="12";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+5)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		aday=tjj+5;
        			amonth=tmm;
        			ayear=tyyyy;
	        		
	        	}
	        	else if((jj==tjj+6)&&(mm==tmm)&&(yyyy==tyyyy))
	        	{
	        		if(cnst!=9)
	        		{
	        			atime=9;
	        			String m="9";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+6)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=10)
	        		{
	        			atime=10;
	        			String m="10";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+6)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=11)
	        		{
	        			atime=11;
	        			String m="11";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+6)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		else if(cnst!=12)
	        		{
	        			atime=12;
	        			String m="12";
	        			a.setConsultation_time(m);
	        			String sDate1=String.valueOf(tjj+6)+"-"+String.valueOf(tmm)+"-"+String.valueOf(tyyyy);  
	        		    try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
							a.setConsultation_date(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        			affected=true;
	        		}
	        		
	        		
	        		
	        	}
	        	
	        	
	        	
	        	affected=true;
	        	
	        }
			if (affected==true)
			{break;}
			
		}
		l.info("Adding consultation with ID: "+a.getId());
		return ConsultationRepo.save(a);
	}
	
	

}
