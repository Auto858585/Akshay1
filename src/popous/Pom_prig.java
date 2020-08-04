package popous;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom_prig 
{
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("java",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(2000);
		search.sendKeys("testing",Keys.ENTER);
		

}}
