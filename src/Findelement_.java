import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement_ {
	
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
			  
		  
   WebElement ele=driver.findElement(By.id("email"));
   ele.sendKeys("akshaymandloi7@gmail.com");
 
   WebElement pwd= driver.findElement(By.name("pass"));
   pwd.sendKeys("love007");
   
  WebElement log= driver.findElement(By.id("loginbutton"));
   Thread.sleep(2000);
   log.click();
   driver.close();
  
   
	}}
