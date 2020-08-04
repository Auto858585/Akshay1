package X_patthcon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_x {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj']/input[@type='text']")).sendKeys("7777885131");
		//driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("akshay007", Keys.ENTER);
		
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
	WebElement	electronic= driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
	
		Actions a= new Actions(driver);
		
		Thread.sleep(5000);
		
		a.moveToElement(electronic).perform();
		
		
		  Thread.sleep(5000);
		 
		 
	      driver.findElement(By.xpath("//a[@href='/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']")).click();
	      
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//div[text()='Redmi K20 Pro (Flame Red, 128 GB)']")).click();
	      
	     
	     Set<String> mob = driver.getWindowHandles();
	      for(String tab:mob)
	      {
               driver.switchTo().window(tab);	    	  
	      }
	      driver.findElement(By.xpath("//button[@type='button']")).click();
	    	  
	
            
	
		

		// driver.findElement(By.xpath("//button[@class='_2AkmmA
		// _29YdH8']")).click();;
		// driver.findElement(By.xpath("//input[@title='Search for products,
		// brands and more']")).sendKeys("Applemobile", Keys.ENTER);
		// Thread.sleep(5000);
		// driver.close();

	}
}
