package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitSynch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		while(true) {
			try {
				driver.findElement(By.id("nav-search-submit-button")).click();
				break;
			}
			catch (Exception e) {
				System.out.println("Element not found");
			}
		}
		
		driver.quit();

	}

}
