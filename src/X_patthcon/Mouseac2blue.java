package X_patthcon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouseac2blue 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		
		
	WebElement jewl=	driver.findElement(By.xpath("//a[@title='Jewellery']"));
	
	Actions a= new Actions(driver);
	
	a.moveToElement(jewl).perform();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@data-p='mens-jewellery-kadas,m']")).click();
	driver.findElement(By.xpath("//img[@src='https://kinclimg3.bluestone.com/f_webp,c_scale,w_515,b_rgb:f0f0f0/giproduct/BVOR0069B05_YAA22XXXXXXXXXXXX_ABCD00-PICS-00002-1024-23145.png']")).click();
	     
	
	
               Set <String>tab=	driver.getWindowHandles();
               for(String tabs:tab)
               {
                 driver.switchTo().window(tabs);            	   
               }
	
	
	     
}}
