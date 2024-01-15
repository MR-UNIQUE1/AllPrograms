package com.java.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Print {
	public WebDriver driver ;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize();
	  
  }

}
