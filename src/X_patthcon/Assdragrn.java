package X_patthcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assdragrn {
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//lanuching browser
	  driver.manage().window().maximize();
	  
	  
	
	  driver.get("https://jqueryui.com/droppable/");
	  
	  WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//frame tag to switch its important 
	  
	 driver.switchTo().frame(frame);
	 Actions a= new Actions(driver);

    WebElement from= driver.findElement(By.xpath("//div[@id='draggable']"));
   WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
	
	 a.clickAndHold(from).perform();
	 
	a.dragAndDrop(from, to).perform();
	System.out.println(to.getText());
	
}}


