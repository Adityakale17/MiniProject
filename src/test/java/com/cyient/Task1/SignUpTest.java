package com.cyient.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.SignTestPage;
import com.cyient.utils.DataProviderUtils;


public class SignUpTest extends  WebDriverWrapper{
	
	@Test(dataProvider = "validCredentialExcelData" , dataProviderClass = DataProviderUtils.class)
	public void testSingup(String firstName,String lastName,String mail,String pass)
	{
		SignTestPage page = new SignTestPage(driver);
		
		page.clickOnsignUp();
		
		page.sendFirstnaMe(firstName);
		page.sendLastName(lastName);
		page.sendMail(mail);
		page.sendPass(pass);
		page.clickOnSubmit();
	
		
		
		Assert.assertEquals(page.validateMsg(), "Please enter mobile number");
		
	}

}
