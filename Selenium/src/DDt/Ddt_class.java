package DDt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ddt_class 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		//   WebDriver driver= new ChromeDriver();
		String va=Generic_class.ddt("Sheet1",1,1);
		System.out.println(va);
		   
		   
		   
		
	}

}
