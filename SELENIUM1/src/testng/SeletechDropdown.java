package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeletechDropdown {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  	WebElement d = driver.findElement(By.id("dropdown-class-example"));
	  	Select se = new Select(d);
	  List<WebElement> t = 	se.getOptions();
	  System.out.println("The number of options in dropdown is "+ t.size());
	  for (int i = 0; i < t.size(); i++) {
		System.out.println(t.get(i).getText());
	}
  }
  @BeforeTest 
 	public void beforetest ()  throws InterruptedException {
 		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
 		ChromeOptions s = new ChromeOptions();
 		s.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(s);
 		driver.get("https://seletech.in/practice/");
 		driver.manage().window().maximize();
 		Thread.sleep(3000);
 		}
}
