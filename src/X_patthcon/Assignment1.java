package X_patthcon;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");

		Thread.sleep(15000);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);

		WebElement frame = driver.findElement(By.xpath("//iframe[@role='application']"));
		driver.switchTo().frame(frame);

		Actions a = new Actions(driver);

		WebElement chat = driver.findElement(
				By.xpath("//div[@class='lc-1ozfevo eqd5v0k0 lc-1xypejv-appear-done lc-1xypejv-enter-done']"));
		a.moveToElement(chat).perform();

		a.click().perform();

		Thread.sleep(3000);
		
		
	      driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("akshay");
	
	
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akshay123@gmail.com");
		
		/*WebElement nom = driver.findElement(By.xpath("//input[@name='rw0udouoylf_146917605549304831']"));
		a.moveToElement(nom).perform();
		a.sendKeys("89898989");*/
				
		
		
      driver.findElement(By.xpath("//input[@id='8qd0zsmpqa_3']")).sendKeys("diamond ring");
      driver.findElement(By.xpath("//textarea[@id='lot6t62glel_4']")).sendKeys("i wanna be purches ring ");
      
		driver.findElement(By.xpath("//div/button[@type='submit']")).click();
      

      
			}
}
