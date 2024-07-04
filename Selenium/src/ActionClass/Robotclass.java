package ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass
{
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.selenium.dev/");
	   Actions act= new Actions(driver);
	   Robot r=new Robot();
	   for(int i=1;i<=5;i++)
	   {
	   WebElement ele= driver.findElement(By.xpath("//a[@class='nav-link']"));
	   act.moveToElement(ele).build().perform();
	   act.contextClick(ele).build().perform();
	   Thread.sleep(2000);
	 
	   r.keyPress(KeyEvent.VK_T);
	   r.keyRelease(KeyEvent.VK_T);
	   }
  


}
}
