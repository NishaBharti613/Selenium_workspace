package WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass5
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
Select	s=new Select(month);
List<WebElement>	opt=s.getOptions();
ArrayList<String>l=new ArrayList<>();
for(WebElement op:opt)
{
String	text=op.getText();
l.add(text);

	
}
Collections.sort(l);
for(String l1:l)
{
	System.out.println(l1);
}
}
}