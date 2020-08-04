import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://www.naukri.com/");//load the url
	  String title =driver.getTitle();
	  String parent=driver.getWindowHandle();//it used to handle parent window handle
	  
	  System.out.println("urlname is:===>"  + driver.getCurrentUrl());
	  Set<String> windows=driver.getWindowHandles();//it will all window hanndle chilea parent other
	  windows.remove(parent);
	  for(String win : windows)//it use to remove the child window
	  {
		  System.out.println("All window handle "+win);
		  driver.switchTo().window(win);
	  driver.close();
	  }
	  
}
}