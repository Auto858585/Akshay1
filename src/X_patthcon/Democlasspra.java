package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Democlasspra
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		  driver.get("https://demo.actitime.com/login.do");
		   
		  driver.findElement(By.id("username")).sendKeys("admin");
	                       
	                           Thread.sleep(1000);
	                        
	  driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);//directly we use enter button
	  Thread.sleep(2000);
	 
	  driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[contains(.,'Create Chart')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='saveControlContainer createChartModeElement name']//input[@placeholder='Enter Chart Name']")).sendKeys("akshay",Keys.ENTER);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='buttonIcon']/span[text()='Save']")).click();
	  Thread.sleep(2000);
	  driver.close();
	                    
}
}
