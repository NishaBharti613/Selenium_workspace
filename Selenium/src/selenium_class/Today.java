package selenium_class;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Today 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.navigate().to("https://www.google.com");
		   Thread.sleep(2000);
		 //  driver.navigate().to("https://www.facebook.com");
		  // Thread.sleep(2000);
		 //  driver.navigate().back();
		  // Thread.sleep(2000);
	Dimension	d = new Dimension(400, 300);
		 //  driver.manage().window().maximize();
		   driver.manage().window().setSize(d);
		   
		  // driver.navigate().forward();
		   
		  // driver.manage().window().setZide(d);
		   Point p=new Point(400,300);
		   driver.manage().window().setPosition(p);
		   
		   
		
	}
}
