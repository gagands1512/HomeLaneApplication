package com.cyient.utilites;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils{
	
	@DataProvider
	public Object[][] emptyMobileNoExcelData() throws IOException{
		Object[][] main = ExcelUtils.sheetIntObjectArray("src/test/resources/testData/HomeLaneSheet.xlsx","emptyNo");
		return main;
	}
	
	@DataProvider
	public Object[][] emptyEmailExcelData() throws IOException{
		Object[][] main = ExcelUtils.sheetIntObjectArray("src/test/resources/testData/HomeLaneSheet.xlsx","emptyEmail");
		return main;
	}
	
	@DataProvider
	public Object[][] placeOrderExcelData() throws IOException{
		Object[][] main = ExcelUtils.sheetIntObjectArray("src/test/resources/testData/HomeLaneSheet.xlsx","placeAnOrder");
		return main;
	}

}
