package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Todaytask 
{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.shoppersstack.com/");
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.findElement(By.name("loginBtn")).click();

	}

}
