import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Annumusprog 
{
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay/Desktop/httml/form1.html");
		
		WebDriverWait  ww= new WebDriverWait(driver, 10);//create object of wait driverclass
		
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			
			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.name("textB")).isDisplayed();
			}
		});
		driver.findElement(By.name("textA")).sendKeys("akshay");
}
}
