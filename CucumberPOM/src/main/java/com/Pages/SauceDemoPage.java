package com.Pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoPage {
	
	private WebDriver driver;

	public SauceDemoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.id("login-button");
	private By priceTag = By.xpath("//div[@class='inventory_item_price']");
	private By cartLink = By.xpath("//a[@class='shopping_cart_link']");
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void eterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void getPageTitle() {
		driver.getTitle();
	}
	
	public int getPriceTagCount() {
		return driver.findElements(priceTag).size();
	}
	
	public void selectHighestPrizeProduct() {
		int productCount = driver.findElements(priceTag).size();
		ArrayList<Double> priceTagList = new ArrayList<Double>();
		for(int i=0;i<productCount;i++) {
			priceTagList.add(Double.parseDouble(driver.findElements(priceTag).get(i).getText().replace("$", "")));
		}
		Collections.sort(priceTagList, Collections.reverseOrder());
		double highestPrice = priceTagList.get(0);
		String highPrice = String.valueOf(highestPrice);
		String xpath = "//div[@class='pricebar']//div[contains(text()[2],'"+highPrice+"')]/ following-sibling::button";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void clickShoppingCart() {
		driver.findElement(cartLink).click();
		String selectedItemPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
		System.out.println(selectedItemPrice);
	}
	

}
