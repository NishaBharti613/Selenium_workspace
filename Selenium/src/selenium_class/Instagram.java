package selenium_class;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram
{
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  
	  WebDriver driver= new ChromeDriver();
	   
  driver.get("https://www.instagram.com/");
  
  driver.manage().window().maximize();
  
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nishabharti25999@gmail.com");
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("nisha1234");
 
 Thread.sleep(2000);
 driver.findElement(By.xpath("//div[text()='Log in']")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
Thread.sleep(2000);

//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("niranjan_ka_18");
//Thread.sleep(2000);



 

  }

}