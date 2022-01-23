package repository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import config.MyConnection;
import model.EmailDetails;
import model.UserDetails;
import java.util.ArrayList;



public class EmailDetailsDaoRes {

	
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	public void EmailDetailsDaoRes() throws SQLException
	{
		connection=MyConnection.getConnection();
		statement=connection.createStatement();
	}
	
	
	
	
	public boolean compose(EmailDetails details)
	{
	int res = 0;
	try {
		res = statement.executeUpdate("insert into emaildetails2 values('"+details.getEmailid()+"','"+details.getTo()+" ','"+details.getFrom()+"','"+details.getSubject()+"','"+details.getEmailbody()+"')");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(res==1)
	{
	return true;
	}
	return false;
	}
public static void inbox(String username1) {
	
boolean f= false;
	try {
		Connection con = MyConnection.getConnection();
		String sql = "select *From emaildetails2 ";
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(sql);
		while(rs.next())
		{
			EmailDetails dt= new EmailDetails();
			dt.setEmailid(rs.getString("emailid"));
			dt.setTo(rs.getString("to"));
			dt.setFrom(rs.getString("From"));
			dt.setSubject(rs.getString("subject"));
			dt.setEmailbody(rs.getString("emailbody"));
		}
	}catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}









