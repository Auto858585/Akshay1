import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_googleindeep {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/akshay/Desktop/HTML%20_DEMO/ButtonClick.html");
        
		 new WebDriverWait(driver, 10).until(new  ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver arg0) {
				
				
				return driver.findElement(By.id("sBtn")).isEnabled();
			}
	
		});
		           driver.findElement(By.id("sBtn")).click();
		}
		
				
				
	
		
}
