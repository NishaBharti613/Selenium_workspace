package Screenshot;

import java.io.File;
import java.lang.annotation.Target;
import java.util.logging.FileHandler;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	   Thread.sleep(2000);
	   TakesScreenshot t=(TakesScreenshot)driver;
	   File src=t.getScreenshotAs(OutputType.FILE);
	   File targetFile=new File("C:\\Users\\lenovo\\Desktop\\Screenshot");
	  // FileHandler.copy(src,t);
	   
	   
}
}
