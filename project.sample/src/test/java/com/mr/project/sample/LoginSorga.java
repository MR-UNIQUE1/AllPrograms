package com.mr.project.sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class LoginSorga extends Open_Url {
  @Test (description = "This test case is to verify sorga login and logout ")
  public void Sorga_Login() throws Exception{
	  LoginStatus s = new LoginStatus(driver);
	  s.Sorgaslogin();
	  s.Sorgaalogout();
  }
  @BeforeClass
  public void beforeClass() throws Exception{
	  BrowserLunch("Chrome", "https://www.saucedemo.com/");
  }

}
