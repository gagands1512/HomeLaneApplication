package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashWallMoutedStudyTablePage {
	private By clickBookFreeLocator = By.id("bfcbtn");
	private By emailIdLocator = By.xpath("//input[@placeholder='Enter your email']");
	private By mobileNoLocator = By.xpath("//input[@placeholder='Enter your mobile number']");
	private By clickOnConfirmLocator = By.id("bfc");
	
	private WebDriver driver;
	
	public DashWallMoutedStudyTablePage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickBookFree() {
		driver.findElement(clickBookFreeLocator).click();
	}
	public void emailIdForBuy(String email) {
		driver.findElement(emailIdLocator).sendKeys(email);		
	}
	public void mobileNo(String mobile) {
		driver.findElement(mobileNoLocator).sendKeys(mobile); 
	}
	public void clickOnConfirm() {
		driver.findElement(clickOnConfirmLocator).click();
	}
	
}
