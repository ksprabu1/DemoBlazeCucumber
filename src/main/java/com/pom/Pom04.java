package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom04 {

	public static WebDriver driver;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(xpath = "(//input[@class='form-control'])[6]")
	private WebElement country;
	
	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	private WebElement city;
	
	@FindBy(xpath = "(//input[@class='form-control'])[8]")
	private WebElement creditcard;
	
	@FindBy(xpath = "(//input[@class='form-control'])[9]")
	private WebElement month;
	
	@FindBy(xpath = "(//input[@class='form-control'])[10]")
	private WebElement year;
	
	@FindBy(xpath = "//button[text()='Purchase']")
	private WebElement purchase;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement ok;

	public Pom04(WebDriver driver2) {
		Pom04.driver=driver2;
		PageFactory.initElements(driver2, this);
				
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getPurchase() {
		return purchase;
	}

	public WebElement getOk() {
		return ok;
	}


}
