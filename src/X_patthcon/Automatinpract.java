package X_patthcon;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automatinpract
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']")).click();
		
		driver.findElement(By.xpath("//ul[@class='tree dynamized']/li/a[contains(.,'Casual Dresses')]")).click();
		
		
		Actions a= new Actions(driver);
	WebElement	dress=driver.findElement(By.xpath("//img[@title='Printed Dress']"));
	a.moveToElement(dress).perform();
		
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("akshay007@gmail.com",Keys.ENTER);
		
    
}
}