package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoactime_xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.actitime.com/login.do");
	 
	  //driver.findElement(By.xpath("//b[contains(.,'admin')]")).getText(); //[X-PATH BY CONATINS ]
	 
	 WebElement usname= driver.findElement(By.xpath("//b[text()='admin']"));// using text get x_path
	 
	 String ustext= usname.getText();
	 System.out.println(ustext);
	 
	 
	 WebElement password= driver.findElement(By.xpath("//b[text()='manager']"));// using text get x_path
	   System.out.println(password.getText());
	   
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ustext);

	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password.getText(),Keys.ENTER);
	
}
}