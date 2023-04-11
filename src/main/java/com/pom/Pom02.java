package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom02 {
public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//a[text()='Cart']")
	private WebElement cart;

	

	public Pom02(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	public WebElement getCart() {
		return cart;
	}
	


}
