package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowManyLInksInGoogle {
	public static WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> dr = driver.findElements(By.tagName("a"));
	  System.out.println("The available links in the google "+ dr.size());
	//  int count = 0;
	  for (int i = 0; i < dr.size(); i++) {
		
			System.out.println(dr.get(i).getText());
			
	}
	//  System.out.println("The visible links are "+ count);
  }
  @BeforeTest 
	public void beforetest ()  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}