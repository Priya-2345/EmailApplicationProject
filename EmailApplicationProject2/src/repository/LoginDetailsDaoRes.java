package repository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.MyConnection;
import model.UserDetails;


public class LoginDetailsDaoRes {
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	public LoginDetailsDaoRes() throws SQLException
	{
		connection=MyConnection.getConnection();
		statement=connection.createStatement();
	}
	
	public boolean signUp(UserDetails user) throws SQLException {
		// TODO Auto-generated method stub
	
	int r=statement.executeUpdate("insert into userdetails values('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getFirstname()+"','"+user.getLastname()+"','"+user.getLocation()+"','"+user.getMobileno()+"')");
	if(r==1)
	{
	return true;
	}else
		return false;

	}
	public boolean signIn(UserDetails user) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String tuser=user.getUsername();
		String pass=user.getPassword();
		resultSet=statement.executeQuery("select *from userdetails where username1='"+tuser+"' and password='"+pass+"'");
		if(resultSet.next())
		{
		return true;
		}else
			return false;
	}

	
	public boolean updateUser(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return false;
	}
}

