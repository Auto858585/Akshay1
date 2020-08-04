package popous;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Response.OutputType;

import com.google.common.io.Files;

public class Shot_scrolldown 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();// launching browser
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     
     TakesScreenshot ts=(TakesScreenshot)driver;
    File SCreenshot= ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
    File screen= new File("./Screenshot.png/");
    Files.copy(SCreenshot, screen);
    
}
}