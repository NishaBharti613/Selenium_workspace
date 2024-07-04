package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("file:///C:/Users/lenovo/Desktop/file.html");
	   Thread.sleep(2000);

	 driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\lenovo\\Desktop");

}
}
