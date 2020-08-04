import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Load_bow 
{
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
WebDriver driver = new ChromeDriver();//lanuching browser
driver.navigate().to("https://www.facebook.com/");//load the url
driver.close();//close the browser {

}}
