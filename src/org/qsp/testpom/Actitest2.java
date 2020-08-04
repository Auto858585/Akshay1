package org.qsp.testpom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Actipom2;

import selenium_pro18.Takrscreen;

public class Actitest2 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	 System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//launching browser
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.actitime.com/login.do");
	 Thread.sleep(2000);
	 
	  Actipom2 at=new Actipom2(driver);
	  
	    at.sendtext("admin");
	    at.sendtext2("manager");
	    Thread.sleep(1000);
	    Takrscreen.takescrees("name1", driver);
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    at.louout();
	    Thread.sleep(1000);
	    at.sendtext("admin");
	    at.sendtext2("manager");
	    
	 
	 
	  
  }
}