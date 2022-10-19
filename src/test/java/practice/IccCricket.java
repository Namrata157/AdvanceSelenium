package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccCricket {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i/batting");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//a[@href='https://www.icc-cricket.com/rankings/mens/player-rankings/t20i/batting']")).click();
		
		List<WebElement> contents = driver.findElements(By.xpath("//table/tbody/tr"));
		for(int i=2;i<=contents.size();i++)
		{
			String countryName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/span[@class='table-body__logo-text']")).getText();
			if(countryName.equals("IND"))
			{
				String playerName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]/a")).getText();
				String ratings = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				System.out.println(countryName + " " + playerName + " " + ratings);
			}
		}
		
		driver.quit();
	}

}
