import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbassign {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		driver.findElement(By.name("q")).sendKeys("javabooks", Keys.ENTER);
	

		driver.findElement(By.xpath("//div[@class='_3ywJNQ']/div[contains(.,'Price -- Low to High')]")).click();
		Thread.sleep(2000);

		List<WebElement> rating = driver.findElements(By.xpath("//div[@class='hGSR34']"));

		for (WebElement webElement : rating) {
			

			System.out.println(webElement.getText());
		}
	}
}
