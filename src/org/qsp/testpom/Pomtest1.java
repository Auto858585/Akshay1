package org.qsp.testpom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Selenim_pomprog;

public class Pomtest1 
{
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		
		Selenim_pomprog sp= new Selenim_pomprog(driver);
		sp.sendtext("java");
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		sp.sendtext("testing");
		
		
}
}