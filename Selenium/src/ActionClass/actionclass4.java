  package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass4
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://demo.guru99.com/test/drag_drop.html");
		   
		   WebElement sourc= driver.findElement(By.xpath("//a[.='5000']"));
		   WebElement target= driver.findElement(By.xpath("(//li[@class='placeholder']"));
		   
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		   act.dragAndDrop(sourc,target).build().perform();
		   
		   }

}
