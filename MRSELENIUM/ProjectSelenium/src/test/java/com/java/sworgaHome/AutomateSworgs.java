package com.java.sworgaHome;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.ecommerce.SorgaBasepage.Sorgabasepage;
import com.java.ecommerce.pageUI.Login_Sworga;

public class AutomateSworgs extends Sorgabasepage{
  @Test
  public void LoginApp() throws Exception {
	 Login_Sworga s = new Login_Sworga(driver);
	 s.login();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 browserLunch(getData("browser"),getData("url"));
  }




}
