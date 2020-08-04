package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOusemove 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
	  
	  
	  //load the url
	 /* WebElement ele = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	  Actions a = new Actions(driver);
	  //a.contextClick(ele).perform();
      a.contextClick();//it will click on top right
      */
      
      
      ////DOUBLE CLICK PATH 

	  WebElement ele = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	  Actions a= new Actions(driver);
	  a.doubleClick(ele);
	  
	
	  
}}