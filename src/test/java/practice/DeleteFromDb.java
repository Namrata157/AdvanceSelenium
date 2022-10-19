package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class DeleteFromDb {

	public static void main(String[] args) throws SQLException {
		Driver dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
		Statement statement=connection.createStatement();
		int result = statement.executeUpdate("delete from wcsm18 where empid=1005;");
		System.out.println("Number of rows affected "+result);
		
		ResultSet result1 = statement.executeQuery("select * from wcsm18;");
		while(result1.next())
		{
			System.out.println(result1.getInt("EmpId")+"\t"+result1.getString("EmpName")+"\t"+result1.getString("Address"));
		}
		
		connection.close();
	}

}
