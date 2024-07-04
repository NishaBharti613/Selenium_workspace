package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qalk 

{
    public static void main(String[] args) throws InterruptedException 
    {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   
	   Thread.sleep(60000);
	   driver.get("https://chat.qspiders.com/");
	   
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nishabharti25999@gmail.com");
	   
	   Thread.sleep(6000);
	   
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nisha123");
	   Thread.sleep(2000);

	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   Thread.sleep(6000);
	   driver.findElement(By.xpath("//a[@href='/student-dashboard/QKO-JSAJVD-M1']")).click();
	   
	   Thread.sleep(6000);

       driver.findElement(By.xpath("//span[@text='Niranjan L T']")).click();
	   
	   Thread.sleep(6000);
	   

     // driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Niranjan L T");
	   
	 // Thread.sleep(6000);
	  
	  driver.findElement(By.xpath("//input[@name='message']")).sendKeys("hi sir, msg sent using Automation");
	   
	  Thread.sleep(6000);
	  
	  driver.findElement(By.xpath("//button[@class='chatSubmitButton']")).click();
	   
	  Thread.sleep(6000);
	  
	  driver.close();
	  

	  

	  
	   
	  	   
	   
	   


	   

	
		} 
}
