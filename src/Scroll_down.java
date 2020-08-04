import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down
{
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0, 1000)");
         Thread.sleep(2000);
         js.executeScript("window.scrollBy(-500, 0)");
         
         js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
}}
