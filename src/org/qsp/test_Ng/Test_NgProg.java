package org.qsp.test_Ng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_NgProg 
{
    @Test
    public void m1() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
  	  WebDriver driver = new ChromeDriver();//launching browser
  	  driver.manage().window().maximize();
  	  
  	  driver.get("https://demo.actitime.com/login.do");
  	 Thread.sleep(2000);
  	 Reporter.log("hey.........", true);
    	//System.out.println("hi");
 
    }


   @Test
   public void m2()
   {
	   System.out.println("hi2");
   }
}

