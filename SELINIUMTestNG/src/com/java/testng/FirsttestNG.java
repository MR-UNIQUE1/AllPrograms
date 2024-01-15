package com.java.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirsttestNG {
  @Test
  public void FirstTestNG() {
	  System.out.println("kumat");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("sunil");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("parida");
  }

}
