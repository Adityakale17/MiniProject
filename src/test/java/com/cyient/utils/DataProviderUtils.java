package com.cyient.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
	
    @DataProvider
	public Object[][] validCredentialExcelData() throws IOException
	   {
		   Object[][] main=ExcelUtils.getSheetIntoObjectArray("src/test/resources/Testdata/miniproject.xlsx", "ValidCredential");
		   return main;
	   }

}
