package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom01 {
public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='hrefch'])[2]")
	private WebElement phoneModel;

	public Pom01(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getPhoneModel() {
		return phoneModel;
	}


}
