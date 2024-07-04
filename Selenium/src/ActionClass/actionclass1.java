package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass1 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   WebElement ele= driver.findElement(By.xpath("//div[.='EN']"));
	   Actions act=new Actions(driver);
	   Thread.sleep(2000);
	   act.moveToElement(ele).build().perform();
}
}
