package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	private By freeAccess = By.xpath("//a[contains(text(),'Free Access')]");
	private By searchBox = By.xpath("//input[@class='search-keyword']");
	private By searchBtn = By.xpath("//button[@class='search-button']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean isFreeAccess() {
		return driver.findElement(freeAccess).isDisplayed();
	}
	
	
}
