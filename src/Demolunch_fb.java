import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolunch_fb
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.get("https://www.facebook.com/");//load the url
	  //driver.close();//close the browser 
	  driver.quit();
}
}
