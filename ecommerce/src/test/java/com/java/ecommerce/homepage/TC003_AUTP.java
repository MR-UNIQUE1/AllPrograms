package com.java.ecommerce.homepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.ecommerce.basepage.AUTP_Basepage;
import com.java.ecommerce.pageUI.Entering_All_Data;

public class TC003_AUTP extends AUTP_Basepage{
  @Test
  public void f() throws Exception {
	  Entering_All_Data s = new Entering_All_Data(driver);
	  s.Entering_data();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  browser(getData("browser"), getData("url"));
  }

}
