package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("file:///C:/Users/lenovo/Desktop/mainpage.html");
		   WebElement ele= driver.findElement(By.id("a1"));
		   Thread.sleep(2000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   driver.findElement(By.id("a2")).click();
		   Thread.sleep(1000);
		   driver.switchTo().parentFrame();
		   Thread.sleep(1000);
		   ele.clear();
		   driver.switchTo().frame(1);
		   Thread.sleep(1000);
		 //  driver.findElement(By.id("a2")).sendKeys("API");
		   
		
	}

}
