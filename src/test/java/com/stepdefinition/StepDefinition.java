package com.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
@Given("User Launch the url")
public void user_launch_the_url() throws IOException {
	String url = File_Reader_Manager.getInstanceCr().getUrl();
    getUrl(url);
}

@When("User choose a mobile phone")
public void user_choose_a_mobile_phone() {
	pom.getInstancePom01().getPhoneModel().click();
}

@Then("User see the nextpage")
public void user_see_the_nextpage() {
    System.out.println("Nextpage opened");
}

@When("user click add to cart buutton")
public void user_click_add_to_cart_buutton() throws InterruptedException {
	Thread.sleep(3000);
	pom.getInstancePom02().getAddToCart().click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}

@When("User click the cart icon")
public void user_click_the_cart_icon() {
	pom.getInstancePom02().getCart().click();
}

@When("User click a place order button")
public void user_click_a_place_order_button() {
	pom.getInstancePom03().getPlaceOrder().click();
}

@When("User enter a Name")
public void user_enter_a_name() {
	pom.getInstancePom04().getName().sendKeys("Ksprabu");
}

@When("User enter a country name")
public void user_enter_a_country_name() {
	pom.getInstancePom04().getCountry().sendKeys("India");
}

@When("User enter a city")
public void user_enter_a_city() {
	pom.getInstancePom04().getCity().sendKeys("Chennai");
}

@When("User enter a card number")
public void user_enter_a_card_number() {
	pom.getInstancePom04().getCreditcard().sendKeys("0987654321123456");
}

@When("User select a card expiry month")
public void user_select_a_card_expiry_month() {
	pom.getInstancePom04().getMonth().sendKeys("12");
}

@When("User select a card expiry year")
public void user_select_a_card_expiry_year() {
	pom.getInstancePom04().getYear().sendKeys("2025");
}

@When("User Click a purchase button")
public void user_click_a_purchase_button() {
	pom.getInstancePom04().getPurchase().click();
}

@When("User Click a Ok button")
public void user_click_a_ok_button() throws InterruptedException {
	Thread.sleep(5000);
	pom.getInstancePom04().getOk().click();
}

}
