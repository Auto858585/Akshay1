package X_patthcon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_prh
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	  
	  driver.findElement(By.xpath("//input[@type='search']']")).sendKeys("sofa", Keys.ENTER);
	
	
   

}}
