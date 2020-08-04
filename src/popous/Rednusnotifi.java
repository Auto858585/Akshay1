package popous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rednusnotifi 
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        
        //driver.manage().timeouts().implicitlyWait(10, "Timeunitms");
	}
}
