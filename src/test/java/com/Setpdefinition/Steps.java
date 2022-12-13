package com.Setpdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import com.ObjectRepositary.Validation;
import com.ReusableMethod.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Commonactions {
	Commonactions c = new Commonactions();
	Validation v = new Validation();
	@Given("User launch the browser")
	public void user_launch_the_browser() {
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User click on create new account")
	public void user_click_on_create_new_account() {
		//c.cc(v.getCreate());
		v.getCreate().click();
	}

	@When("User enter the first name{string}")
	public void user_enter_the_first_name(String string) {
	    c.sk(v.getFname(), string);
	}

	@Then("User enter the sur name{string}")
	public void user_enter_the_sur_name(String string) {
	    c.sk(v.getSname(), string);
	}

	@Then("User enter the mail id{string}")
	public void user_enter_the_mail_id(String string) {
	    c.sk(v.getMail(), string);
	}

	@Then("User enter the password{string}")
	public void user_enter_the_password(String string) {
	  c.sk(v.getPass(), string);
	}

	@Then("User enter the date of birth")
	public void user_enter_the_date_of_birth() {
		c.select(v.getDate(), "24");
		c.select(v.getMonth(), "Jan");
		c.select(v.getYears(), "1996");
	}

	@Then("User click on submit")
	public void user_click_on_submit() {
	    v.getSubmit().click();
	}

}
