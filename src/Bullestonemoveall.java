import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium_pro18.Takrscreen;

public class Bullestonemoveall {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");

		Thread.sleep(3000);
		List<WebElement> menuname = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li")); // array
																										// list(class)to
																										// list(interface)upcast

		Actions a = new Actions(driver);

		for (WebElement names : menuname) {

			String allname = names.getText();
			allname = names.getText().substring(0, 1) + names.getText().substring(1).toLowerCase();
			System.out.println(names.getText());
			Thread.sleep(5000);
			Thread.sleep(3000);
			a.moveToElement(names).perform();
			

			Thread.sleep(3000);
           
			Takrscreen.takescrees(allname, driver);
			
			List<WebElement> insidename = driver.findElements(
					By.xpath("//a[contains(.,'" + allname + "')]/parent::li/descendant::ul[@class='two-col']/li"));
			for (WebElement getname : insidename) {
				
				System.out.println(getname.getText());
			}
		}

	}
}
