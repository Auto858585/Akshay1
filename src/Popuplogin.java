import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuplogin {
	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();//launching browser
		  driver.manage().window().maximize();
		  
           driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
           
           
           //directly we pass id and pop in atuodication 
}
}