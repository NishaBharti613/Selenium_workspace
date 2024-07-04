package selenium_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) {
		
	
    System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("file:///C:/Users/lenovo/Desktop/facebook.html");
    String url=driver.getCurrentUrl();
    System.out.println(url);
    
    String source=driver.getPageSource();
    System.out.println(source);
    
    String title = driver.getTitle();
    System.out.println(title);
    
    driver.close();
    
	}
}
