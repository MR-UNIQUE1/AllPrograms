package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleWebtables {
	public static WebDriver driver;

  @Test
  public void HandelTheWindow () throws InterruptedException {
	  driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	  Thread.sleep(2000);
	  String str = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]")).getText();
	  String [] rr = str.split("\n");
	  for (int i = 0; i < rr.length; i++) {
		if (rr[i].equalsIgnoreCase("Selenium webdriver")) {
			driver.findElement(By.id("APjFqb")).clear();
			driver.findElement(By.id("APjFqb")).sendKeys(rr[i]);
			driver.findElement(By.name("btnK")).click();
		}
	}
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException { 
			System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
			ChromeOptions s = new ChromeOptions();
			s.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(s);
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
