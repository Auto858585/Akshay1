import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://www.facebook.com/");//load the url
	  String title =driver.getTitle();
	  System.out.println(title);
	  System.out.println("+++++++++++========>  "+ driver.getTitle());
	  System.out.println("urlname is:===>"  + driver.getCurrentUrl());
	  driver.close();
	  
	
}
}