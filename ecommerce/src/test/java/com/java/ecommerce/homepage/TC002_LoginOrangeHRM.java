package com.java.ecommerce.homepage;

import org.testng.annotations.Test;

import com.java.ecommerce.basepage.Lunching_Browser;
import com.java.ecommerce.pageUI.LoginHRM;

import org.testng.annotations.BeforeTest;

public class TC002_LoginOrangeHRM extends Lunching_Browser {
  @Test
  public void f() throws Exception {
	  LoginHRM s = new LoginHRM(driver);
	  s.loginHRMM();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 lb(getData("browser"), getData("url"));
  }

}
