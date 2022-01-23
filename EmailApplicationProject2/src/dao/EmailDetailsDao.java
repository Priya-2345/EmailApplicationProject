package dao;
import java.util.ArrayList;

import model.EmailDetails;


public interface EmailDetailsDao {
	
		public boolean compose(EmailDetails details);
		
		 ArrayList<EmailDetails> inbox(String username);
	}





