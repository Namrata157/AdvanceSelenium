package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		//1: Create an object of Driver class
		Driver dbDriver=new Driver();
		
		//import Driver fromcom.mysql.cj.jdbc only
		//new Driver ;-throws sql exception
		
		//2: Register dbDriver to JDBC
		DriverManager.registerDriver(dbDriver);
		
		//3: Establish the JDBC connection
		//import connection,statement and resultSet from java.sql package only
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
		
		//4:Create the statement
		Statement statement = connection.createStatement();
		
		//5:Execute the query
		ResultSet result= statement.executeQuery("select * from wcsm18;");
		
		//6:Fetch the data
		while(result.next())
		{
			System.out.println(result.getInt("EmpID")+"\t"+result.getString("EmpName")+"\t"+result.getString("Address"));
		}
		
		//7:Close database connection
		connection.close();

	}

}
