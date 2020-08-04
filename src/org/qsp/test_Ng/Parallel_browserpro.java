package org.qsp.test_Ng;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_browserpro {
   WebDriver driver;
   
   @BeforeMethod
   @Parameters("browser")
   public  void bm(String bName)
   {
	   if(bName.equalsIgnoreCase("firefox"))
	   {
                System.setProperty("webdriver.gecko.driver",".\\Software\\geckodriver.exe" );
	       driver = new FirefoxDriver();
	   }
	   if(bName.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		   driver = new ChromeDriver();
	   }
   }
   
   
   @Test
   public void m() throws InterruptedException
   {

	   driver.get("https://www.google.com/");
	   
	   Thread.sleep(2000);
	   driver.close();
}}
