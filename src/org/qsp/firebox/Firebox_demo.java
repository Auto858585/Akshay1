package org.qsp.firebox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Firebox_demo {
	@Test
	
	public void demo()
	{
		  System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  
		  driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
			Reporter.log("java m1", true);

	}

}
