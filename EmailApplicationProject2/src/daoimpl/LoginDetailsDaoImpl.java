package daoimpl;
import java.sql.SQLException;

import dao.LoginDetailsDao;
import model.UserDetails;
import repository.LoginDetailsDaoRes;



	public class LoginDetailsDaoImpl implements LoginDetailsDao{
		
		
		LoginDetailsDaoRes loginDetailsDaoRes=null;
		
		public LoginDetailsDaoImpl() throws SQLException
		{
			loginDetailsDaoRes=new LoginDetailsDaoRes();
		}
		
		@Override
		public boolean signUp(UserDetails user) {
			// TODO Auto-generated method stub
			
			try {
				return loginDetailsDaoRes.signUp(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("problem in sign up"+e.getMessage());
				return false;
			}
		}

		@Override
		public boolean signIn(UserDetails user) {
			// TODO Auto-generated method stub
			try {
				return loginDetailsDaoRes.signIn(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public boolean updateUser(String username) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deleteUser(String username) {
			// TODO Auto-generated method stub
			return false;
		}

	}