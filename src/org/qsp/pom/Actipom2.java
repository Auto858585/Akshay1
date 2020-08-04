package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actipom2 {

	@FindBy(xpath = "//input[@name='username']")

	private WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logoutbtn;

	public Actipom2(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void sendtext(String text1) {
		username.sendKeys(text1);

	}

	public void sendtext2(String text2) {
		password.sendKeys(text2, Keys.ENTER);
	}

	public void louout() {
		logoutbtn.click();
	}
}
