package popous;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_pro18.Takrscreen;

public class Scroll_onpoint

{
	public static  void main(String[] args) throws InterruptedException, IOException {
		int flag=0;
		int n=1;
		
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	       driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		do{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		 try{
	       org.openqa.selenium.WebElement next=driver.findElement(By.xpath("//td[@class='b d6cvqb']/a[@class='G0iuSb']/span[contains(.,'Next')]"));
	       Takrscreen.takescrees("page"+n,driver);
	       Thread.sleep(2000);
	    	   next.click();
		 }
		 catch(NoSuchElementException e)
		 {
			 flag=1;
			 System.out.println("reached till the condition");
		 } }while(flag==0);
	}}