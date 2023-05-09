package com.fluentinterface.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fluentinterface.utilities.DriverFactory;

public class ReviewPageActController {
	WebDriver driver = DriverFactory.getDriver();
	
	public ReviewPageActController clickSubmitReview() {
		driver.findElement(By.className("write-product-review-button")).click();
		return this;
	}
	
	public ReviewPageActController sendReview(String title, String review, String rating) {
		driver.findElement(By.className("review-title")).sendKeys(title);
		driver.findElement(By.className("review-text")).sendKeys(review);
		driver.findElement(By.cssSelector("div[class='rating-options']>input[value='"+rating+"']")).click();
		driver.findElement(By.className("write-product-review-button")).click();
		return this;
	}

}
