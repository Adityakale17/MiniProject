package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorTestPage {
	private WebDriver driver;
	
	private By clickOnSigninLocator = By.linkText("Sign In");
	private By clickOnSignLocator = By.xpath("//span[@class='btn-text-hmc'][normalize-space()='Sign In']");
	private By userNamevalidateMsgLocator = By.id("j_username-error");
	private By passErrValidLocator = By.id("j_password-error");
	public ErrorTestPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void clickOnSignin()
	{
		driver.findElement(clickOnSigninLocator).click();
	}
	
	public void clickOnSign()
	{
		driver.findElement(clickOnSignLocator).click();
	}
	
	public String userNamevalidateMsg() {
		
		String actualvalue = driver.findElement(userNamevalidateMsgLocator).getText();
		
		return actualvalue;
		
	}
	
	public String passErrValid()
	{
		String actualvalue1 = driver.findElement(passErrValidLocator).getText();
		return actualvalue1;
	}

}
