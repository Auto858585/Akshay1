import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_pro 
{
   public static void main(String[] args) throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	   
	   WebDriver Driver4 = new ChromeDriver();
	   Driver4.manage().window().maximize();
	   Driver4.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   Driver4.navigate().back();
	   Thread.sleep(2000);
	   Driver4.navigate().forward();
	   Thread.sleep(2000);
	   Driver4.navigate().refresh();
	   Driver4.close();
	 //  Driver4.close();
	   
	   
}
}
