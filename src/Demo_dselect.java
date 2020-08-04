import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_dselect {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay/Desktop/HTML%20_DEMO/url.html");
		
            WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
    Select s= new  Select(ele);
    List<WebElement> opt = s.getOptions();
    if(s.isMultiple())
    for(WebElement dsele:opt)
    {
    	s.selectByValue(dsele.getAttribute("value"));
    	Thread.sleep(1000);
    }
    s.deselectAll();
}
}