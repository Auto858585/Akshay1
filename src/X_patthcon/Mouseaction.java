package X_patthcon;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.urbanladder.com/");
	 
	  Thread.sleep(10000);
	     
	  driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();

	  
	 
	  WebElement sale=driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
	  
	   Actions a= new Actions(driver);
	    
		  Thread.sleep(10000);
	   //a.moveToElement(sale).build().perform();//both same 32 and 31 
	    a.moveToElement(sale).perform();
	    driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/descedant::span[contains(.,'Wooden Sofa Sets')]")).click();
        
	}
}