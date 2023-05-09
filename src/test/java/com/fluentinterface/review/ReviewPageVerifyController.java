package com.fluentinterface.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import com.fluentinterface.utilities.CommonVerifier;
import com.fluentinterface.utilities.DriverFactory;

public class ReviewPageVerifyController {
	WebDriver driver = DriverFactory.getDriver();
	CommonVerifier verifier = CommonVerifier.getCommonVerifier();
	
	public ReviewPageVerifyController verifyReviewColdUser(String alertColor) {
		WebElement OnlyRegistered = driver.findElement(By.className("message-error"));
		Color color = Color.fromString(OnlyRegistered.getCssValue("color"));
		WebElement reviewTitle = driver.findElement(By.className("review-title"));
		WebElement reviewText = driver.findElement(By.className("review-text"));
		verifier.areEquals(OnlyRegistered.getText(), "Only registered users can write reviews")
				.areEquals(color, Color.fromString(alertColor));
		System.out.println(reviewTitle.isEnabled());
		System.out.println(reviewText.isEnabled());
		verifier.isNotEnabled(reviewTitle)
				.isNotEnabled(reviewText);
		return this;
	}
	
	public ReviewPageVerifyController verifyReviewHotUser() {
		WebElement reviewTitle = driver.findElement(By.className("review-title"));
		WebElement reviewText = driver.findElement(By.className("review-text"));
		WebElement reviewRating = driver.findElement(By.className("rating"));
		
		verifier.isDisplayed(reviewTitle)
				.isDisplayed(reviewText)
				.isDisplayed(reviewRating);
		return this;
	}
}
