package Screenshot;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task 
{
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.findElement(By.xpath("//a[@contains(text(),'Apparel & Shoes')]"));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div"));
	   driver.close();
	   
}
}
