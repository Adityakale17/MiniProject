package com.cyient.Task3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.DealPage;


public class DealTset extends WebDriverWrapper{
	
	@Test
	public void dealTest() throws InterruptedException
	{
		
		
		DealPage obj = new DealPage(driver);
		obj.clickOnDeal();
		obj.clickOnDiscount();
		obj.clickOnSeven();
		obj.actionClass();
		obj.clickOnAddButton();
		obj.basketIcon();
		obj.viewBasket();
		obj.saveProduct();	
		
		}
	

}
