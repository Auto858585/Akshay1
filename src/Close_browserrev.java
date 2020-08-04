import java.awt.List;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_browserrev 
{

public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://www.naukri.com/");//load the url
	  String title =driver.getTitle();
	  String parent=driver.getWindowHandle();
	  System.out.println("parent window handle "+parent);
	  Thread.sleep(2000);
	  
	  Set<String>windows = driver.getWindowHandles();
	  
	  //close  the window reverse order 
	  
	 java.util.List<String> lst= new ArrayList<String>(windows);
	  for(int i=lst.size()-1;i>=0;i--)
	  {
		String win=lst.get(i);
		driver.switchTo().window(win);
		Thread.sleep(2000);
		
		
	  }
	  
	  
	  
	  
}

}
