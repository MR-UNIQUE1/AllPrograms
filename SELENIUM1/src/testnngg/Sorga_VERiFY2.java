package testnngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sorga_VERiFY2 {
	public WebDriver driver;
	
	@Test(dataProvider = "testt")
	public void Login (String useryname , String passyword) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
	ChromeOptions s = new ChromeOptions();
	s.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(s);
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
		driver.findElement(By.id("user-name")).sendKeys(useryname);
		  driver.findElement(By.id("password")).sendKeys(passyword);
		  driver.findElement(By.id("login-button")).click();
		  Thread.sleep(2000);
		 if (useryname.equals("standard_user")&& passyword.equals("secret_sauce")) {
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			  driver.findElement(By.id("logout_sidebar_link")).click();
		} else if (!"standard_user".equals(useryname)&&"secret_sauce".equals(passyword)) {
			System.out.println("Plz enter the currect username ");
		}else if (useryname.equals("standard_user")&&!passyword.equals("secret_sauce")) {
			System.out.println("Enter the currect password ");
		}else {
			System.out.println("enter the currect username and passward");
		}
		 
		  driver.quit();
	}
	
	@DataProvider (name = "testt")
	public Object[][] Test () {
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"Sunil","123id"},
			{"standard_user","secret_sauce"},
			{"towm ", "jihdd"}
		};
	}
  

}
