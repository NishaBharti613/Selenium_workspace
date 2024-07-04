package WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("file:///C:/Users/lenovo/Desktop/elements.html");
		   List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
		   int count=checkbox.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(int i=0;i<=count-1;i++){
			Thread.sleep(2000);
			checkbox.get(i).click();	
		}
		for(int i=count-1;i>=0;i--) {
			checkbox.get(i).click();
			Thread.sleep(2000);
		}
}
}
