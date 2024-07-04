package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		 driver.get("file:///C:/Users/lenovo/Desktop/single.html");
	WebElement	dp =driver.findElement(By.xpath("//select[@id='Hotel']"));
	Select	s=new Select(dp);
	s.selectByIndex(0);
	s.selectByValue("2");
	Thread.sleep(2000);
	s.selectByVisibleText("Kabab");
List<WebElement>	select=s.getAllSelectedOptions();
System.out.println(select);
for(WebElement se:select)
{
	System.out.println(se);
}
	
}
}