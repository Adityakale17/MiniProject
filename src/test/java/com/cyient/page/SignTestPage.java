package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignTestPage {
 	private WebDriver driver;
 	private By clickOnsignUpLocator = By.linkText("Sign Up");
 	private By sendFirstnaMeLocator = By.xpath("//input[@id='firstName']");
 	private By sendLastNameLocator= By.xpath("//input[@id='lastName']");
 	private By sendMailLocator = By.xpath("//input[@id='email']");
 	private By sendPassLocator= By.xpath("//input[@id='pwd']");
 	private By clickOnSubmitLocator = By.id("signup-form-submit");
 	private By validateMsgLocator= By.xpath("//em[@id='mobileFieldVerifySignUp-error']");
 	
 	
 	
 	public SignTestPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnsignUp()
 	{
 		driver.findElement(clickOnsignUpLocator).click();
 	}
 	
 	public void sendFirstnaMe(String firstName) {
 		driver.findElement(sendFirstnaMeLocator).sendKeys(firstName);
 	}
 	
 	public void sendLastName(String lastName)
 	{
 		driver.findElement(sendLastNameLocator).sendKeys(lastName);
 	}
	
 	public void sendMail(String mail)
 	{
 		driver.findElement(sendMailLocator).sendKeys(mail);
 	}
 	
 	public void sendPass(String pass)
 	{
 		driver.findElement(sendPassLocator).sendKeys(pass);
 	}
 	
 	public void clickOnSubmit() {
 		driver.findElement(clickOnSubmitLocator).click();
 	}
 	
 	public String validateMsg()
 	{
 		String actualvalue = driver.findElement(validateMsgLocator).getText();
 		return actualvalue;
 	}
}










