package com.cyient.task2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.ErrorTestPage;


public class SignupTask2 extends WebDriverWrapper	{
	
	@Test
	public void testTask() throws InterruptedException
	{
		
		
		ErrorTestPage object = new ErrorTestPage(driver);
		
		object.clickOnSignin();
		object.clickOnSign();
		
		
		Assert.assertEquals(object.userNamevalidateMsg(), "Enter your email address");
		
		
		
		Assert.assertEquals(object.passErrValid(), "Enter Your Password");
		
	}
}
