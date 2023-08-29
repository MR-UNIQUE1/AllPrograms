package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinksFoundInAutomationTestingPratice {
	public static WebDriver driver;
  @Test
  public void f() {
	List<WebElement> ff= driver.findElements(By.tagName("a"));
	System.out.println("Number of the links are present in this site "+ ff.size());
	for (int i = 0; i < ff.size(); i++) {
		System.out.println(ff.get(i).getText());
	}
  }
  @BeforeTest 
	public void beforetest ()  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}