package testnngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sorga_VERiFY {
	public WebDriver driver;
	
	@Test(dataProvider = "testt")
	public void Login (String useryname , String passyword) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(useryname);
		  driver.findElement(By.id("password")).sendKeys(passyword);
		  driver.findElement(By.id("login-button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("react-burger-menu-btn")).click();
		  driver.findElement(By.id("logout_sidebar_link")).click();
	}
	
	@DataProvider (name = "testt")
	public Object[][] testt () {
		Object [][] data = new Object[2][2];
		data [0][0]= "standard_user";
		data [0][1]= "secret_sauce";
		
		data[1][0]="admin";
		data[1][1]="admin";
	
		
		return data;
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
