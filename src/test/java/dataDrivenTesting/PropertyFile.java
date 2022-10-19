package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
		p.load(fis);
		String browser = p.getProperty("Browser");
		System.out.println(browser);
		String Url = p.getProperty("url");
		System.out.println(Url);
		String Username = p.getProperty("username");
		System.out.println(Username);
		String Password = p.getProperty("password");
		System.out.println(Password);
	}

}
