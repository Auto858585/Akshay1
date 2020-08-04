package X_patthcon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Fbdemorobot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		Select sday = new Select(day);
		sday.selectByValue("18");
		

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);

		m.selectByVisibleText("Nov");

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select y = new Select(year);
		y.selectByValue("1992");
		
		System.out.println("+++++++++++++++++==========>>>>>>>");
		
		List<WebElement> days = sday.getOptions();
		for(WebElement daysval:days)
		{
			System.out.println(daysval.getText());
		}
		


	}}