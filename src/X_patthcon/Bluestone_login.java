package X_patthcon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.xpath("//input[@placeholder='Search for Jewellery']")).sendKeys("ring", Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='p-image']/a[@target='_blank']")).click();

		Set<String> tabs = driver.getWindowHandles();
		// switch the tab//
		for (String tab : tabs) {
			driver.switchTo().window(tab);
		}

		driver.findElement(By.xpath("//input[@class='exclusive btn style2 btn-block addToCart']")).click();
	}

}
