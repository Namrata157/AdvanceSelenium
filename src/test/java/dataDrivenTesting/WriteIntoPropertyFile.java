package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteIntoPropertyFile {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
		p.load(fis);
		
		//To write into properties file
		p.put("url2","https://www.facebook.com/");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Data.properties");
		p.store(fos,"Saved successfully");

	}

}
