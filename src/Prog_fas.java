import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog_fas 
{
	 public static void main(String[] args) 
	  {
		  System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		  
		  WebDriver driver2= new ChromeDriver();
		  driver2.get("https://www.Fashion.com/");
		  //driver2.close();
		
	}
}
