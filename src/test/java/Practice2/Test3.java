package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Facebook.properties");
		Properties p=new Properties();
		p.load(fis);
		p.put("url2", "https://www.snapdeal.com/");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Facebook.properties");
		p.store(fos,"Properties file updated");
		
		

	}

}
