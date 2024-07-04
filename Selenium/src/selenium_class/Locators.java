

package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String[] args)  throws InterruptedException
	{
   System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("file:///C:/Users/lenovo/Desktop/Locators.html");
    
   // WebElement link =driver.findElement(By.tagName("a"));
    //Thread.sleep(2000);
   // driver.findElement(By.className("c2"));
   // driver.findElement(By.id("a2")).click();
    
    
    
    
    WebElement ele=driver.findElement(By.name("n2"));
    Thread.sleep(2000);
    ele.sendKeys("selenium");
    driver.close(); 
	
	}
}

