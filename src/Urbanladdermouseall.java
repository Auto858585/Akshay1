import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladdermouseall {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();// close
																								// the
																								// pop-up

		Thread.sleep(2000);

		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));// move
																									// mouse
																									// all
																									// menu

		System.out.println(menus.getClass());

		System.out.println("==================");

		Actions a = new Actions(driver);

		for (WebElement menuname : menus) {
			String name = menuname.getText();

			System.err.println(name); // err=(error) to print in RED color

			Thread.sleep(2000);

			a.moveToElement(menuname).perform();
			Thread.sleep(2000);

			List<WebElement> submenus = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li")); // print
																														// all
																														// sub
																														// menus
																														// name

			for (WebElement sub : submenus) {
				System.out.println(sub.getText());
			}
		}
	}
}
