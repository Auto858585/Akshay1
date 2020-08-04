import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunch_pro 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.flipkart.com/");
   
	 driver.findElement(By.id("text")).sendKeys("akshaymandloi7@gmail.com");
                        
                        Thread.sleep(1000);
      driver.findElement(By.name("password")).sendKeys("akshay0007");
                      
                                
      driver.findElement(By.id("submit")).click();        
                               
                               
}
}