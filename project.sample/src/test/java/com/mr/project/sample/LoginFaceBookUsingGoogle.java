package com.mr.project.sample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFaceBookUsingGoogle extends OpenUrl{
  @Test
  public void f() {
	  SearchFacebookInGoogle s = new SearchFacebookInGoogle(driver);
	  s.OpenFaceBook();
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	  LunchBrowser("chrome", "https://google.com");
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
