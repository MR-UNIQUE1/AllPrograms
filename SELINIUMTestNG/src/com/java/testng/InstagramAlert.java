package com.java.testng;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class InstagramAlert {
	public static WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver();
		driver.get("http://www.instagram.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  }
  @Test(priority = 1)
  public void verify() throws Exception {
	  driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("7735688331");
		driver.findElement(By.name("password")).sendKeys("7752033606");
			Thread.sleep(3000);
		driver.findElement(By.cssSelector("div._ab8w._ab94._ab99._ab9f._ab9m._ab9p._abak._abb8._abbq._abb-._abcm")).click();
		Thread.sleep(8000);
  }
  @Test(priority = 2)
  public void wntry () throws Exception {
	  driver.findElement(By.cssSelector("button._acan._acao._acas._aj1-")).click();
	  Thread.sleep(18000);
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("svg._ab6-")).click();
  }

}
