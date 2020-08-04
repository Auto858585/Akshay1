import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_window 
{
    public static void main(String[] args) 
    {
	   System.setProperty("wendriver.chromedriver", "Software/chromedriver.exe");
	   
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.naukri.com/");
	   
	   String title=driver.getTitle();
	   System.out.println("==============>>>>");
	   System.out.println(title);
	   
	   System.out.println(driver.getCurrentUrl());
	   
	  String parent= driver.getWindowHandle();
	   
	  
	   driver.navigate().refresh();
	   
	   
	}
}
