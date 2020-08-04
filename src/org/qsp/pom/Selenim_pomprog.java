package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenim_pomprog 
{
  
	@FindBy(name="search")
	
	private WebElement search;

	@FindBy(xpath="//img[@class='search-icon']")
	private WebElement searchbtn;
	
	
	public Selenim_pomprog(WebDriver  driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void sendtext(String text)
	{
		search.sendKeys(text,Keys.ENTER);
		
	}
	public void clicksearchbtn()
	{
         searchbtn.click();
}
}
