import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitprogra {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/akshay/Desktop/httml/form1.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement text1 = driver.findElement(By.xpath("//input[@name='textA']"));
		text1.sendKeys("what's ur name");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.textToBePresentInElementValue(text1, "what's ur name"));

		driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("akshaymandloi");

	}
}