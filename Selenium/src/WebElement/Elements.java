package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://www.amazon.in/");
		   List<WebElement> al1_link = driver.findElements(By.xpath("//a"));
		   int count=al1_link.size();
		  
		System.out.println(count);
	}
	

}
