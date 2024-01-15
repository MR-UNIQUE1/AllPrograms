package com.java.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Gmail {
	public WebDriver driver ;
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
  }

  @Test(priority = 1)
  public void f() {
	  driver.findElement(By.linkText("Gmail")).click();
	  driver.findElement(By.linkText("Sign in")).click();
  }
  @Test(priority = 2)
  public void g () throws Exception {
	 driver.findElement(By.id("identifierId")).sendKeys("sunil617@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
  }
}
