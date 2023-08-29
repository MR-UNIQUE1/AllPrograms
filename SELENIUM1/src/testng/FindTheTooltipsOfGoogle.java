package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindTheTooltipsOfGoogle {
	public WebDriver driver;
  @Test
  public void f() {
	String tool= driver.findElement(By.id("hplogo")).getAttribute("alt");
	System.out.println(tool);
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
