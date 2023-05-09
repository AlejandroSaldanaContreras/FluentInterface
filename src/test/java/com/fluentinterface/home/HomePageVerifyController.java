package com.fluentinterface.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.fluentinterface.utilities.CommonVerifier;
import com.fluentinterface.utilities.DriverFactory;

public class HomePageVerifyController {
	CommonVerifier verifier = CommonVerifier.getCommonVerifier();
	WebDriver driver = DriverFactory.getDriver();
	
	public HomePageVerifyController verifyCategory(String ExpectedCat) {
		WebElement ActualCategory = driver.findElement(By.cssSelector("div[class='page-title']>h1"));
		//System.out.println(category.getText());
		verifier.areEquals(ActualCategory.getText(), ExpectedCat);
		return this; 
	}
	
	public HomePageVerifyController verifyTag(String ExpectedTag) {
		WebElement ActualCategory = driver.findElement(By.cssSelector("div[class='page-title']>h1"));
		//System.out.println(category.getText());
		verifier.areEquals(ActualCategory.getText(), "Products tagged with '"+ExpectedTag+"'");
		return this;
	}
	
	public HomePageVerifyController verifyResults() {
		List<WebElement> results = driver.findElements(By.className("product-item"));
		List<WebElement> resultsImages = driver.findElements(By.cssSelector("div[class='product-item']>div[class='picture']"));
		List<WebElement> resultsNames = driver.findElements(By.className("product-title"));
		List<WebElement> resultsRanking = driver.findElements(By.className("product-rating-box"));
		List<WebElement> resultsAddButtons = driver.findElements(By.className("product-box-add-to-cart-button"));
		List<WebElement> resultsPrices = driver.findElements(By.className("actual-price"));
		for(int i=0; i<results.size()-1; i++) {
			Assert.assertTrue(resultsImages.get(i).isDisplayed());
			Assert.assertTrue(resultsNames.get(i).isDisplayed());
			Assert.assertTrue(resultsRanking.get(i).isDisplayed());
			Assert.assertTrue(resultsAddButtons.get(i).isDisplayed());
			Assert.assertNotEquals(resultsPrices.get(i).getText(), "", "Price is not displayed");
		}
		return this;
	}
	
	
}
