package X_patthcon;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New_Tab 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
		driver.findElement(By.xpath("//input[@aria-autocomplete='both']")).sendKeys("java",Keys.ENTER);
		
            WebElement click = driver.findElement(By.xpath("//div[@data-attrid='title']/span[contains(.,'Java')]"));
	 
	 
	   Actions a= new Actions(driver);
	   Thread.sleep(3000);
	   a.moveToElement(click).perform();
	   Thread.sleep(1000);
	   a.doubleClick(click).perform();
	   
	   Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_C);
	   Thread.sleep(2000);
	   r.keyPress(KeyEvent.VK_CONTROL);

		  r.keyPress(KeyEvent.VK_T);
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_V);
		  r.keyPress(KeyEvent.VK_ENTER);

	}}
		  
		  

		  
			   
	   
	   
	   
	  

