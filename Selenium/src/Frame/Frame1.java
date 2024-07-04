package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 
{
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("file:///C:/Users/lenovo/Desktop/mainpage.html");
	   driver.findElement(By.id("a1")).sendKeys("selenium");
	   driver.switchTo().frame(0);
	   Thread.sleep(2000);
	   driver.findElement(By.id("a2")).sendKeys("API");
	   
}
}
