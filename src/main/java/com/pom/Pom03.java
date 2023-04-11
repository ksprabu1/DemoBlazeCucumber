package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Pom03 {
	public static WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrder;

	public Pom03(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

}
