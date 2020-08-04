package X_patthcon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions a= new Actions(driver);
		a.moveToElement(coin).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-1gms,m']")).click();
		
		driver.close();
		
		}}
