package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drang_drop 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://jqueryui.com/droppable/");
	 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//frame tag to switch its important 
	 driver.switchTo().frame(frame);
     WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
	 
	 Actions a= new Actions(driver);
	 
	 
	 a.dragAndDropBy(drag, 200, 0).perform();
	 
}}
