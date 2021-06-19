package com.cyient.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.DashWallMoutedStudyTablePage;
import com.cyient.page.HomeOfficePage;
import com.cyient.page.HomePage;
import com.cyient.page.SignUpPage;
import com.cyient.utilites.DataProviderUtils;

public class SignInTest extends WebDriverWrapper{

	@Test(dataProvider="emptyMobileNoExcelData",dataProviderClass = DataProviderUtils.class)
		public void emptyPhoneNo(String username,String email,String pincode,String expectedValue) throws IOException {
			
			HomePage hp = new HomePage(driver);
			hp.clickLoginRegister();
			
			SignUpPage sup = new SignUpPage(driver);
			sup.userName(username);
			sup.userEmail(email);
			sup.userPincode(pincode);
			sup.clickOnSignUp();
			
			String emptyPhoneNumber = driver.findElement(By.id("phone__error")).getText();
			Assert.assertEquals(emptyPhoneNumber,expectedValue);
			
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("D:\\AutomationTraining\\Day3\\New folder\\HomeLaneApplication\\src\\test\\resources\\screenshots\\test.png"));
			
		}
	@Test(dataProvider="emptyEmailExcelData",dataProviderClass = DataProviderUtils.class)
	   public void emptyEmail(String username,String mobileno,String pincode,String expectedValue) throws IOException {
			HomePage hp = new HomePage(driver);
			hp.clickLoginRegister();
			
			SignUpPage sup = new SignUpPage(driver);
			sup.userName(username);
			sup.userPhoneNo(mobileno);
			sup.userPincode(pincode);
			sup.clickOnSignUp();
			
			String emptyPhoneNumber = driver.findElement(By.id("email__error")).getText();
			Assert.assertEquals(emptyPhoneNumber,expectedValue);
			
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("D:\\AutomationTraining\\Day3\\New folder\\HomeLaneApplication\\src\\test\\resources\\screenshots\\test2.png"));
		   
	   }
	
	@Test(dataProvider="placeOrderExcelData",dataProviderClass = DataProviderUtils.class)
	public void placeAnOrder(String email,String mobileno,String expectedValue) throws InterruptedException, IOException {
		  HomePage hp = new HomePage(driver);
		  hp.clickOnHomeOffice();
		
		  HomeOfficePage hop = new HomeOfficePage(driver);
		  hop.scrollToDashWall();	
		  Thread.sleep(5000);
		  hop.clickOnDashWallMountedStudyTablePage();
		  
		  DashWallMoutedStudyTablePage dwmstp = new DashWallMoutedStudyTablePage(driver);
		  dwmstp.clickBookFree();
		  dwmstp.emailIdForBuy(email);
		  dwmstp.mobileNo(mobileno);	
		  dwmstp.clickOnConfirm();
		  WebDriverWait wait=new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pincode__error")));
		  
		  String emptyPincode = driver.findElement(By.id("pincode__error")).getText();
		  Assert.assertEquals(emptyPincode,expectedValue);	
		  
		  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshotFile, new File("D:\\AutomationTraining\\Day3\\New folder\\HomeLaneApplication\\src\\test\\resources\\screenshots\\test3.png"));
		 
	}
		
}
