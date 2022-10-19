package Practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Test1 {

	public static void main(String[] args) throws SQLException {
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
		Statement statement=connection.createStatement();
		int result = statement.executeUpdate("insert into student values(1003,'Pradip','Maharashtra')");
		System.out.println("No of rows affected " +result);
		
		ResultSet result1 = statement.executeQuery("select * from student");
		while(result1.next())
		{
			System.out.println(result1.getInt("SID") + "\t" + result1.getString("SName") + "\t" + result1.getString("SAddress"));
		}
		connection.close();
		

	}

}
