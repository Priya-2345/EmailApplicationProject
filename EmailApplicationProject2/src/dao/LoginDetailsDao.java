package dao;
import model.UserDetails;

public interface LoginDetailsDao {
	
	public boolean signUp(UserDetails user);
	public boolean signIn(UserDetails user);
	public boolean updateUser(String username);
	public boolean deleteUser(String username);
}









