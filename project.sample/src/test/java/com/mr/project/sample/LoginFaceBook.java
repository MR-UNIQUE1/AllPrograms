package com.mr.project.sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginFaceBook extends OpenUrlForFacebook{
  @Test
  public void f() throws Exception {
	  Login_facebookS s = new Login_facebookS(driver);
	  s.loginF();
  }
  @BeforeTest
  public void beforeTest() {
	  Lunch_Browser_for_Facebook("chrome", "https://facebook.com");
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
