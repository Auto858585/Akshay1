package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
	WebElement	search=driver.findElement(By.xpath("//input[@name='q']"));
	Point loc = search.getLocation();
		int x= loc.x;
		int y= loc.y;
		System.out.println("x value++"+ x +"y value "+ y);
		

}}
