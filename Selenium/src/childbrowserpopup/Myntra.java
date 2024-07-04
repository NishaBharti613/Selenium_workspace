package childbrowserpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.myntra.com/");
		   driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("HRX Shoes");
		 //  driver.findElement(By.xpath("//span@class='myntraweb-sprite desktop "))

}
}