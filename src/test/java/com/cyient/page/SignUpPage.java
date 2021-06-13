package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	private By usernameLocator = By.id("username");
	private By useremailLocator = By.id("useremail");
	private By pincodeLocator = By.id("pincode");
	private By clickOnSignUpLocator = By.id("step3enter");
	private By phonenoLocator = By.id("userphone");
 
	private WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	public void userName(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}
	
	public void userPhoneNo(String phoneno) {
		driver.findElement(phonenoLocator).sendKeys(phoneno);
	}

	public void userEmail(String useremail) {
		driver.findElement(useremailLocator).sendKeys(useremail);		
	}
	
	public void userPincode(String pincode) {
		driver.findElement(pincodeLocator).sendKeys(pincode);	
	}
	
	public void clickOnSignUp() {
		driver.findElement(clickOnSignUpLocator).click();		
	}
}
