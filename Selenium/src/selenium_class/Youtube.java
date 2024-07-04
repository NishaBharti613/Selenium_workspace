package selenium_class;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
	public static void main(String[] args) throws InterruptedException 
    {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.youtube.com/");
		   WebElement sign=driver.findElement(By.name("Sign in"));
		   
	Point loc=sign.getLocation();
		   System.out.println(loc);
		  int x=  loc.getX();
		  System.out.println(x);
		int Y =loc.getY();
		System.out.println(Y);
		   
		 
		Dimension s = sign.getSize();
		   System.out.println(s);
		   int h=s.getHeight();
		   System.out.println(h);
		int w=   s.getWidth();
		System.out.println(w);
		
		
		
    }
	
    }

