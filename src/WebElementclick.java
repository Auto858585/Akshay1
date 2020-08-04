import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementclick 
 {
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.actitime.com/login.do");
   
	  WebElement username = driver.findElement(By.id("username"));
                        username.sendKeys("admin");
                        Thread.sleep(1000);
      WebElement pwd =driver.findElement(By.name("pwd"));
                      pwd.sendKeys("manager");
                                
      WebElement cl = driver.findElement(By.id("loginButton"));        
                               cl.click();
                               Thread.sleep(2000);
                               
	}
}