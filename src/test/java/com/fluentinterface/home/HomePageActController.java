package com.fluentinterface.home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fluentinterface.utilities.DriverFactory;

public class HomePageActController {
	WebDriver driver = DriverFactory.getDriver();
	
	public HomePageActController clickLogIn(){
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		return this;
	}
	
	public HomePageActController search(String product) {
		driver.findElement(By.id("small-searchterms")).sendKeys(product);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		return this;
	}
	
	public HomePageActController clickDigitalDownloadsOption() {
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a")).click();
		return this;
	}
	
	public HomePageActController clickElectronicsOption() {
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
		return this;
	}
	
	public HomePageActController scrollToTags() {
		WebElement tags = driver.findElement(By.className("block-popular-tags"));
		Actions actions = new Actions(driver);
		actions.moveToElement(tags).perform();
		return this;
	}
	
	public HomePageActController clickViewAllTags() {
		driver.findElement(By.cssSelector("div.block.block-popular-tags>div.listbox>div.view-all>a")).click();
		return this;
	}
	public HomePageActController clickDigitalTag() {
		driver.findElement(By.cssSelector("[href='/digital'")).click();
		return this;
	}
}
