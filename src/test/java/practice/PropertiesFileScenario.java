package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFileScenario {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./src/test/resources/Facebook.properties");
		p.load(fis);
		String browser = p.getProperty("browser");
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
//		switch (browser) {
//			case "Chrome":driver=new ChromeDriver();break;
//			case "Firefox" :driver=new FirefoxDriver();break;		
//			default:System.out.println("Invalid browser");
//			break;
//			
//		}
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
			System.out.println("Home page is dispalyed");
		else
			System.out.println("Home page is not displayed");
		
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'x1ey2m1c xds687c xg01cxk')])[8]"));
		Thread.sleep(3000);
		ele.click();


	}

}
