package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jakarta.xml.bind.Element;

public class Frame3 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("file:///C:/Users/lenovo/Desktop/mainpage.html");
	  WebElement ele=driver.findElement(By.id("a1"));
	  ele.sendKeys("selenium"); 
	 WebElement frame=driver.findElement(By.xpath("//iframe[@id='a3']"));
	  driver.switchTo().frame(frame);
	  //driver.switchTo().frame(0); 
	  driver.findElement(By.id("a2")).sendKeys("API");
	  driver.switchTo().parentFrame();
	  Thread.sleep(2000);
	  ele.clear();
	  
	  }
}
