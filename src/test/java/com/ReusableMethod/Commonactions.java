package com.ReusableMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
  public static WebDriver driver;
  
  public void browserlaunch() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
  
  
  public void close() {
	  driver.quit();
  }
  public void cc (WebElement ww ) {
	  ww.click();
  }
  public void sk(WebElement w,String s) {
	  w.sendKeys(s);
  }
  public void select(WebElement d,String f) {
	  Select st = new Select(d);
	  st.selectByVisibleText(f);
	  
  }
}
