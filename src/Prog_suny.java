import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog_suny {
	 public static void main(String[] args) 
	  {
		  System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		  
		  WebDriver driver2= new ChromeDriver();
		  driver2.get("http://ww38.sunnyleaon.com//");
		  //driver2.close();
		
	}

}
