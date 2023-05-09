package com.fluentinterface.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fluentinterface.utilities.DriverFactory;

public class SearchPageActController {
	WebDriver driver = DriverFactory.getDriver();
	
	public SearchPageActController clickResult() {
		driver.findElement(By.cssSelector("div[class='product-item']")).click();
		return this;
	}

}
