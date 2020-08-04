package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoslider {
	{
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();// lanuching browser
		driver1.manage().window().maximize();

		driver1.get("https://jqueryui.com/slider/");
		driver1.switchTo().frame(driver1.findElement(By.xpath("//iframe[@class='demo-frame']")));

		Actions a = new Actions(driver1);
		WebElement slider = driver1.findElement(By.id("slider"));

		for (int i = 0; i < 15; i++) {
			a.dragAndDropBy(slider, 100, 0).perform();

			a.dragAndDropBy(slider, -100, 0);

		}

	}
}
