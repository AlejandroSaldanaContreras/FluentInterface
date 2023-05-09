package com.fluentinterface.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fluentinterface.utilities.DriverFactory;

public class ProductPageActController {
	WebDriver driver = DriverFactory.getDriver();
	
	public ProductPageActController clickReviews() {
		driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[1]")).click();
		return this; 
	}
	

}
