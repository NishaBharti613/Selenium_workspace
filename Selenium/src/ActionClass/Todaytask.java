package ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Todaytask 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://en-gb.facebook.com/login/");
		 
		   WebElement ele= driver.findElement(By.xpath("//li[.='हिन्दी']"));
		   
		   Actions act= new Actions(driver);
		   
		   act.contextClick(ele).build().perform();
		   Thread.sleep(2000);
	//ele.sendKeys(Keys.T);
		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_T);
		   r.keyRelease(KeyEvent.VK_T);
		   r.keyPress(KeyEvent.VK_ALT);
		   r.keyRelease(KeyEvent.VK_F4);
		   
		  
		   
		
	}

}
