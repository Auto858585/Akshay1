package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_xpathpro 
{
      public static void main(String[] args) 
      {
		  System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		  
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshaymandloi");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akshay007");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		 
		 
		 
	}
}
