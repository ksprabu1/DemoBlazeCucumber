package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
public static WebDriver driver;
	
	private Pom01 p1;
	
	private Pom02 p2;
	
	private Pom03 p3;
	
	private Pom04 p4;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public Pom01 getInstancePom01() {
		p1 = new Pom01(driver);
		return p1;
	}
	public Pom02 getInstancePom02() {
		p2 = new Pom02(driver);
		return p2;
	}
	public Pom03 getInstancePom03() {
		p3 = new Pom03(driver);
		return p3;
	}
	public Pom04 getInstancePom04() {
		p4 = new Pom04(driver);
		return p4;
	}
}
