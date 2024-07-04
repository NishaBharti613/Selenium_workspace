package childbrowserpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup1 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.naukari.com/");
		   driver.findElement(By.xpath("//div[.='services']")).click();
		   Set<String>al1_wd=driver.getWindowHandles();
		   for(String wh:al1_wd )
		   {
			  System.out.println(wh); 
		   }

	}

}
