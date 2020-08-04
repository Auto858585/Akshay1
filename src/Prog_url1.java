import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog_url1 
{
 public static void main(String[] args)
 {
   System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
   
   WebDriver driver1= new ChromeDriver();
   driver1.get("https://WWW.FLIPKART.COM/");
   driver1.close();
}
}
