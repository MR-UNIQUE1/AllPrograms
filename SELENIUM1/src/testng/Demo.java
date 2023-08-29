package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	public static WebDriver driver;
  @Test
  public void LoginDemo() throws InterruptedException {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  
  }
  @Test
  public void logout ()  throws InterruptedException {
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  
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

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
