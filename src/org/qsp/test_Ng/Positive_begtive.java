package org.qsp.test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Positive_begtive {

	WebDriver driver;

	@BeforeSuite
	public void brforeS()
	{
		
		Reporter.log("Brfore Suite", true);
	}
	@BeforeClass
	public void beforec() {
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		Reporter.log("brfoe class", true);

	}

	@BeforeTest
	public void beforeM()

	{
		driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}

	@Test
	public void m1() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager", Keys.ENTER);
		Reporter.log("+ve", true);
		Thread.sleep(2000);

	}

	@Test
	public void m2() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager", Keys.ENTER);
		Reporter.log("-ve", true);
		Thread.sleep(2000);

	}

	@AfterMethod
	public void afterM() {
		driver.close();
	}
}
