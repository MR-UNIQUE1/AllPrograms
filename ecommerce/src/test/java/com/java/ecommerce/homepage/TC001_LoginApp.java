package com.java.ecommerce.homepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.ecommerce.basepage.BasePage;
import com.java.ecommerce.pageUI.Opening_App;

public class TC001_LoginApp extends BasePage{
  @Test
  public void LoginApp() throws Exception {
	  Opening_App oo = new Opening_App(driver);
	  oo.Login();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 browserLunch(getData("browser"), getData("url"));
  }


}
