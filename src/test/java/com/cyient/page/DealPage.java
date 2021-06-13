package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DealPage {
	
private WebDriver driver;
private By clickOnDealLocator = By.linkText("Deals");	
private By clickOnDiscountLocator = By.xpath("//button[normalize-space()='Discount Range']");
private By clickOnSevenLocator = 	By.xpath("//div[normalize-space()='70% And Above']");
private By actionClassLocator = By.xpath("//a[@id='prodItemImgLink0']//div[@class='quick-view-hover-layer']");
private By clickOnAddButtonLocator = By.xpath("//button[@id='nav-add']");
private By basketIconLocator = 	By.xpath("//span[@id='small-cart-opener-counter-desktop']");
private By viewBasketLocator = 	By.xpath("//a[normalize-space()='View Basket']");
private By saveProductLocator = By.xpath("//a[@class='basket-favourite-logo favourite-box__logo signin flip-enable saveProduct hidden-xs']");


public DealPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnDeal()
	{
		driver.findElement(clickOnDealLocator).click();
	}
	
	public void clickOnDiscount()
	{
		driver.findElement(clickOnDiscountLocator).click();
	}
	
	public void clickOnSeven()
	{
		driver.findElement(clickOnSevenLocator).click();
	}
	
	public void actionClass() throws InterruptedException
	{
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(actionClassLocator).click();
		
		Thread.sleep(3000);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	public void clickOnAddButton()
	{
		driver.findElement(clickOnAddButtonLocator).click();
	}
	
	public void basketIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(basketIconLocator).click();
	}
	
	public void viewBasket()
	{
		driver.findElement(viewBasketLocator).click();
	}
	
	public void saveProduct()
	{
		driver.findElement(saveProductLocator).click();
	}

}
