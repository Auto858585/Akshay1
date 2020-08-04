package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladermouseac 
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.urbanladder.com/");
	  Thread.sleep(10000);
	        driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();;
	     
	     
	     
	     WebElement sale=driver.findElement(By.xpath("//span[ contains(.,'Sale')]"));
	     
	     Thread.sleep(5000);
	     
	   Actions a= new Actions(driver);
	    a.moveToElement(sale).perform();
}}