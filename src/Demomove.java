import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demomove 
{
	public static void main(String[] args) throws InterruptedException 
	
	  {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com/");

		driver.findElement(By.xpath("//input[@aria-autocomplete='both']")).sendKeys("java",Keys.ENTER);
		
		Thread.sleep(2000);
		
		 java.util.List<WebElement> name = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		 
		 for(WebElement searname:name)
		 {
			 System.out.println(searname.getText());
			
		 }
		 name.get(3).click();
		     
		Thread.sleep(3000);

	}

}
