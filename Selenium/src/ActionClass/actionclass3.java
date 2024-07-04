package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class actionclass3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		   WebElement ele= driver.findElement(By.xpath("//span[.='right click me']"));
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		  // SendKeys(Keys.ESCAPE);
		   act.contextClick(ele).build().perform();
		   //driver.close();
		   
	}

	private static void SendKeys(Keys escape) {
		// TODO Auto-generated method stub
		
	}

}
