package WebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		 driver.get("file:///C:/Users/lenovo/Desktop/single.html");
	WebElement	dp =driver.findElement(By.xpath("//select[@id='Hotel']"));
	Select	s=new Select(dp);
		boolean dis=s.isMultiple();
		if(dis)
		{
			System.out.println("dp is Multiple");
		}
		else {
			{
				System.out.println("dp is single");
			}
		}
		

}
	
}