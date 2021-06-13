package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeOfficePage {
	private By homeOfficeRangeLocator = By.xpath("//h2[text()='Our home office range']");
	private By codwmstpLocator = By.name("https://www.homelane.com/dash-wall-mounted-study-table-cid-HLKT00000601");
	
	private WebDriver driver;
	
	public HomeOfficePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void scrollToDashWall() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(homeOfficeRangeLocator);
		js.executeScript("arguments[0].scrollIntoView();", Element); 
	}
	
	public void clickOnDashWallMountedStudyTablePage() {
		driver.findElement(codwmstpLocator).click();
	}
	
	
}
