package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder_pro 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.urbanladder.com/");
	  Thread.sleep(10000);
	     driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	     
	     WebElement liv=driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/span[@class='topnav_itemname']"));
	     driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(liv.getText(),Keys.ENTER);
	     
	     
	     
	   //span[@class='topnav_itemname']"))[it will match 1/10 xpath so wii will use parent ]
	
	     // driver.findElement(By.xpath("//li[@class='topnav_item saleunit']//span[@class='topnav_itemname']")).click();  //[1/1 x path 
	      
	      //driver.findElement(By.xpath("//span[ contains(.,'Sale')]")).click();//[x_path by Inner text ]
}
}