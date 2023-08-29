package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertsHandel {
	public static WebDriver dri;
  @Test (priority = 0)
  public void f() {
	  dri.findElement(By.id("name")).sendKeys("MR XXX");
	  dri.findElement(By.id("email")).sendKeys("abc222@gmail.com");
	  dri.findElement(By.id("phone")).sendKeys("943808978");
	  dri.findElement(By.id("textarea")).sendKeys("at, po, dist, state ,india");
	  dri.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("www.google.com");
  }
  @Test(priority = 1)
  public void Alerts () throws InterruptedException {
	  dri.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
	 String dt = dri.switchTo().alert().getText();
	 System.out.println(dt);
	 Thread.sleep(2000);
	  dri.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		dri = new ChromeDriver(s);
		dri.get("https://testautomationpractice.blogspot.com");
		dri.manage().window().maximize();
		Thread.sleep(3000);
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  dri.quit();
  }

}
