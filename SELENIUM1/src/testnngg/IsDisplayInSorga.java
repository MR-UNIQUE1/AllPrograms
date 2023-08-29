package testnngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsDisplayInSorga {
		public static WebDriver driver;
  @Test(dataProvider =  "voidd")
  public void f(String username , String Password) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	  driver.findElement(By.id("user-name")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(Password);
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  if (driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).isDisplayed()) {
		  driver.findElement(By.id("react-burger-menu-btn")).click();
		  driver.findElement(By.id("logout_sidebar_link")).click();
	} else {
		System.out.println("Login failed");
	}
	  driver.quit();

  }
 
  @DataProvider(name ="voidd")
  public Object [][] validate(){
	  return new Object[][] {
		  {"standard_user","secret_sauce"},
		  {"Usernaame","passwordd"},
		  {"Admin", "admin123"},
		  {"standard_user","secret_sauce"}
	  };
  }

}
