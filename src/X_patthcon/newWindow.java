package X_patthcon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize(); 
	  
	  
	  Robot r = new Robot();
	  //Robot object
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_N);
	  r.keyPress(KeyEvent.VK_N);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  
	  
	  
}}
