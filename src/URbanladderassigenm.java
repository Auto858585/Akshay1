import java.awt.Desktop.Action;
import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class URbanladderassigenm 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		
		//.manage().timeouts().implicitlyWait(ms, 10);
		
		
		driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='tree dynamized']/li/a[contains(.,'Casual Dresses')]")).click();
      Thread.sleep(1000);
      
      Actions a= new Actions(driver);
        WebElement dress= driver.findElement(By.xpath("//img[@itemprop='image']"));
		Thread.sleep(10000);
		a.moveToElement(dress).perform();
		a.click().perform();
		
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
          //driver.findElement(By.xpath("//button[@type='submit']/span[contains(.,'Add to cart')]")).click();
          
          //add to cart
		
		//driver.findElement(By.xpath("//span[text()='Add to cart']/parent::button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();            //continue
		
		//driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();         //proceed to check out
		
		//WebElement mail = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));//
		//mail.sendKeys("akshay123@gmail.com");
		//mail.click();
		

}
}