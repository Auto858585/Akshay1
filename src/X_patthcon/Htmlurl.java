package X_patthcon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Htmlurl 
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay/Desktop/HTML%20_DEMO/url.html");
		
            WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
            
           Select s= new Select(ele);
           List<WebElement> opt = s.getOptions();
           if(s.isMultiple())
           for(WebElement opts:opt)
           {
        	   s.selectByValue(opt.get(1).getText());
           
        	   s.selectByValue(opt.get(3).getText());
        	   
        	   Thread.sleep(2000);
           }
		List<WebElement> sele = s.getAllSelectedOptions();
		for(WebElement selet:sele)
		{
			System.out.println(selet.getText());
		}
		System.out.println("1 st optins  "+ s.getFirstSelectedOption());
           

	}

}
