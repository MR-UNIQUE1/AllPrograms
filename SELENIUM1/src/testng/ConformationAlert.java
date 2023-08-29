package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConformationAlert {
	public static WebDriver dri;
  @Test
  public void conformation() {
	  dri.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
	  String ss = dri.switchTo().alert().getText();
	  System.out.println(ss);
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
