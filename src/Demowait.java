import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demowait 
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		WebDriverWait w= new WebDriverWait(driver, 10);
		WebElement bt=driver.findElement(By.xpath(""));
		//w.until(ExpectedConditions.elementToBeClickable("bt");
		
}
}