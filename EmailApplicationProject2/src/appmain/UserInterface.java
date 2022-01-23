package appmain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import dao.EmailDetailsDao;
import dao.LoginDetailsDao;
import daoimpl.EmailDetailsDaoImpl;
import daoimpl.LoginDetailsDaoImpl;
import model.EmailDetails;
import model.UserDetails;
import repository.EmailDetailsDaoRes;

public class UserInterface {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("***********Welcome to Email Application****************");
		System.out.println("1: Sign up");
		System.out.println("2: Sign In");
		System.out.println("3: Exit");
		System.out.println("*************************************************************");
		char ch=' ';
		
		LoginDetailsDao LoginDetailsDao=new LoginDetailsDaoImpl();
		 EmailDetailsDaoImpl emailDetailsDao= new EmailDetailsDaoImpl();
		 
		 String username=null,username1,firstname,lastname,password, location, mobileno;
		do {
			System.out.println("What you do wish to check from the above list");
		
		
			Scanner sn=new Scanner(System.in);
			int option=sn.nextInt();
		
			switch(option)
			{
				
				case 1:System.out.println("enter the details to signup");
				System.out.println("enter username");
				       username=sn.next();
				       System.out.println("enter password");
				       password=sn.next();
				       System.out.println("enter firstname");

				       firstname=sn.next();
				       System.out.println("enter lastname");

				       lastname=sn.next();
				       System.out.println("enter location");

				       location=sn.next();
				       System.out.println("enter moboileno");

				       mobileno=sn.next();
						UserDetails user=new UserDetails();
						user.setUsername(username);
						user.setPassword(password);
						user.setFirstname(firstname);
						user.setLastname(lastname);
						user.setLocation(location);
						user.setMobileno(mobileno);
						
						
						
					LoginDetailsDao.signUp(user);
			
					System.out.println("signup completed successfully");
					
					break;
				case 2:
					System.out.println("enter the username and password to login");
					 username1=sn.next();
					String pass=sn.next();
					UserDetails details=new UserDetails();
					details.setUsername(username1);
					details.setPassword(pass);
					boolean res=LoginDetailsDao.signIn(details);
					if(res){
						System.out.println("login successful");
					
					while(true){
						System.out.println("enter the details");
						System.out.println("1:compose");
						System.out.println("2:to");
					    System.out.println("3:from");
					    System.out.println("4:subject");
					    System.out.println("5:emailbody");
					System.out.println("select any options");
					 int c=sn.nextInt();
					 if(c==1){
						 System.out.println("please Enter email id");
						 String eid=sn.next();
						 
						 System.out.println("please Enter Reciever email id");
						 String eto=sn.next();
						 
						 System.out.println("please Enter Sender email id");
						 String efrom=sn.next();
						 
						 System.out.println("please insert subject");
						 String esubject=sn.next();
						 
						 System.out.println("please insert emailbody");
						 String ebody=sn.next();
						 
						 EmailDetails d=new EmailDetails();
						     d.setEmailid(eid);
						     d.setTo(eto);
							d.setFrom(efrom);
							d.setSubject(esubject);
							d.setEmailbody(ebody);
			                boolean ans=emailDetailsDao.compose(d);
			                 if(ans){
			                	 System.out.println("Data inserted Successfully");
			                 }else{
			                 System.out.println("something went wrong");
			                 }
					 }
					 else if(c==2){
						
						 ArrayList<EmailDetails> emailDetails= emailDetailsDao.inbox(username1);
					    Iterator<EmailDetails> emailIterator=  emailDetails.iterator();
					    while(emailIterator.hasNext()) {
					    	EmailDetails edetails = emailIterator.next();
					    	System.out.println(edetails.getSubject()+ "                "+edetails.getEmailbody()); 	
					    }
					 }
					 else{
						 System.out.println("something went wrong");
					 }
			
					  System.out.println("a: display all Emails ");
                           
					
					}
					
					}
					
			try {
				//Emaildetails = emailDetailsDao.inbox(username1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            
   
							
        /*  boolean res;
         if(res)
               System.out.println("login success");
  
   else 
						System.out.println("login failed");*/
			              
              case 3:			
                 System.exit(0);
          default:System.out.println("enter the valid option");
}
System.out.println("Do you wish to check other options");
ch=sn.next().charAt(0);

	}while(ch=='y'||ch=='Y');

}

}

		
		
		 
		

		

		