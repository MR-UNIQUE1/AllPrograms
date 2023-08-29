package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BootstrapAlert {
	public static WebDriver driver;
  @Test
  public void BootstrapAll() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
	 Alert alert =  driver.switchTo().alert();
	 String ss=	alert.getText();
	 System.out.println(ss);
	 alert.sendKeys("Mr XXX");
	 Thread.sleep(2000);
	
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	
  }


}
