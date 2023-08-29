package testnngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SorgaDropdown {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  String str= driver.findElement(By.cssSelector("header_secondary_container")).getText();
	  System.out.println(str);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}
