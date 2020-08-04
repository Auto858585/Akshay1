package org.qsp.test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class google_pos_neg {

	@Test
	public void googleM1() {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		Reporter.log("java m1", true);

	}

	@Test
	public void googleM2() {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("n")).sendKeys("qspder", Keys.ENTER);//if we change "q" the print no such element expection
		Reporter.log("java m1", true);

	}

	
	
	
}
