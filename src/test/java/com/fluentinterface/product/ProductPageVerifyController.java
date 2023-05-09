package com.fluentinterface.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fluentinterface.utilities.CommonVerifier;
import com.fluentinterface.utilities.DriverFactory;

public class ProductPageVerifyController{
	CommonVerifier verifier = CommonVerifier.getCommonVerifier();
	WebDriver driver = DriverFactory.getDriver();
	
	public ProductPageVerifyController verifyProductElements() {
		verifier.isDisplayed(driver.findElement(By.cssSelector("div[class='product-name']>h1")));
		verifier.isDisplayed(driver.findElement(By.cssSelector("div[class='picture']>a>img")));
		verifier.isDisplayed(driver.findElement(By.className("short-description")));
		verifier.isDisplayed(driver.findElement(By.className("sku")));
		verifier.isDisplayed(driver.findElement(By.className("download-sample-button")));
		verifier.isDisplayed(driver.findElement(By.className("add-to-wishlist-button")));
		verifier.isDisplayed(driver.findElement(By.className("add-to-compare-list-button")));
		verifier.isDisplayed(driver.findElement(By.className("email-a-friend-button")));
		verifier.isDisplayed(driver.findElement(By.cssSelector("div[class='product-price']>span")));
		verifier.isDisplayed(driver.findElement(By.className("rating")));
		return this; 
	}

}
