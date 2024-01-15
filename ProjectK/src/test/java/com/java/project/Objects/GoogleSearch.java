package com.java.project.Objects;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.project.basepage.LunchGoogle;
import com.java.project.pageUIS.SearchInGoogle;

public class GoogleSearch extends LunchGoogle {
  @Test
  public void Open() throws Exception{
	  SearchInGoogle g = new SearchInGoogle(driver);
	  g.enter();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  Gbrowser(getData("browser"), getData("url"));
  }
@AfterTest
  public void afterTest() {
  }

}
