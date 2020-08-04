package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actimeloginnxpath 
{


	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.actitime.com/login.do");
	  
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager",Keys.ENTER);
  //driver.findElement(By.xpath("//div[contains(.,'Login ')]")).click();
  
  String tr=driver.getTitle();
  System.out.println(tr);

  Thread.sleep(5000);
  driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
  

  
  
	  
}
}
