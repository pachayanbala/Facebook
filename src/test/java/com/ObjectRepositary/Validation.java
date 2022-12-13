package com.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableMethod.Commonactions;

public class Validation extends Commonactions {
	Commonactions ch = new Commonactions();
	public Validation() {
		PageFactory.initElements(driver, this);
	}
  @FindBy(xpath= "(//a[@role='button'])[2]")
  private WebElement create;
  
  @FindBy(name= "firstname")
  private WebElement fname;
  
  @FindBy(name = "lastname")
  private WebElement sname;
  
  @FindBy(name = "reg_email__")
  private WebElement mail;
  
  @FindBy(id = "password_step_input")
  private WebElement pass;
  
  @FindBy(id="day")
  private WebElement date;
  
  @FindBy(id = "month")
  private WebElement month;
  
  @FindBy(id = "year")
  private WebElement years;
  
  @FindBy(xpath="(//input[@name='sex'])[2]")
  private WebElement gen;
  
  @FindBy(name = "websubmit")
  private WebElement submit;

public WebElement getCreate() {
	return create;
}

public WebElement getFname() {
	return fname;
}

public WebElement getSname() {
	return sname;
}

public WebElement getMail() {
	return mail;
}

public WebElement getPass() {
	return pass;
}

public WebElement getDate() {
	return date;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYears() {
	return years;
}

public WebElement getGen() {
	return gen;
}

public WebElement getSubmit() {
	return submit;
}
}
