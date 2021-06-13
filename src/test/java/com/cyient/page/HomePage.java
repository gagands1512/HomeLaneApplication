package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	private By loginRegisterLocator = By.xpath("//a[text()='Login/Register']");
	private By threedotLocator = By.xpath("//a[text()='•••']");
	private By homeOfficeLocator = By.xpath("//li[@class='headerDesktop_nav-item__3RXhO']//a[@class='headerDesktop_nav-link__3sqar'][normalize-space()='Home Office']");
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLoginRegister() {
		driver.findElement(loginRegisterLocator).click();		
	}
	public void clickOnHomeOffice() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(threedotLocator));		
		driver.findElement(homeOfficeLocator).click();
	}
	
}
