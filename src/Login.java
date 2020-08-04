import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.actitime.com/login.do");
	  driver.findElement(By.id("username")).sendKeys("admin");
      
      Thread.sleep(1000);
   
       driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	  
	  driver.findElement(By.partialLinkText("actiTIME ")).click();
	  Set<String> tabs =driver.getWindowHandles();
	  for(String tab:tabs)
	  {
		  driver.switchTo().window(tab);
	  }
	  System.out.println(driver.getTitle());
	}}
