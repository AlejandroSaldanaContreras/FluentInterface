package com.fluentinterface.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fluentinterface.utilities.CommonVerifier;
import com.fluentinterface.utilities.DriverFactory;

public class SearchPageVerifyController {
	CommonVerifier verifier = CommonVerifier.getCommonVerifier();
	WebDriver driver = DriverFactory.getDriver();
	
	public SearchPageVerifyController verifySearchPage() {
		WebElement searchTitle = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1"));
		verifier.isDisplayed(searchTitle);
		return this;
	}
	
	public SearchPageVerifyController verifyEmptySearch() {
		WebElement searchInput = driver.findElement(By.cssSelector("input[type=text]"));
		verifier.isEmpty(searchInput);
		return this;
	}
	
	public SearchPageVerifyController verifyKeywordSearch(String key) {
		WebElement keywordInput = driver.findElement(By.className("search-text"));
		verifier.areEquals(keywordInput.getAttribute("value"), key);
		return this;
	}
	
	public SearchPageVerifyController verifyResultVisions() {
		WebElement productImage = driver.findElement(By.xpath("//img[@title='Show details for Night Visions']"));
		WebElement productTitle = driver.findElement(By.className("product-title"));
		WebElement productRanking = driver.findElement(By.className("rating"));
		WebElement productAddToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		WebElement productPrice = driver.findElement(By.className("prices"));
		verifier.isDisplayed(productImage);
		verifier.isDisplayed(productTitle);
		verifier.isDisplayed(productRanking);
		verifier.isDisplayed(productAddToCart);
		verifier.isDisplayed(productPrice);
		return this;
	}
}
