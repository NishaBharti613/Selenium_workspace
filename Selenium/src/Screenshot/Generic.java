package Screenshot;

import java.util.Date;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Popups.fileDownloadpopup;

public class Generic 
{
  static String path="c:"
		  static String formate=".jpeg";
  public static void(WebDriver driver)
  {
	 Date d=new Date();
	 String d1=d.toString();
	 String date=d1.replace(":","-" );
	 try {
		TakesScreenshot t=(TakesScreenshot)driver;
		file src=t.getScreenshotAs(OutputType) 
	} catch ({ e) {
		// TODO: handle exception
	}
  }
}
