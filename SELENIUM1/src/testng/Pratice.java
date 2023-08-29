package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pratice  {
	public static WebDriver driver;
	
	@Test
	public void Open_new_window () throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
		Thread.sleep(3000);
		
		Set<String>l = driver.getWindowHandles();
		Object [] t = l.toArray();
		driver.switchTo().window((String)t[1]);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.name("search")).sendKeys("iPhones");
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(t[0].toString());
		driver.findElement(By.id("male")).click();
	}
  @Test
  public void FillupTextboxes() {
	  driver.findElement(By.id("name")).sendKeys("MR Unique");
		driver.findElement(By.id("email")).sendKeys("MrHacker888@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9438089748");
		driver.findElement(By.id("textarea")).sendKeys("At - u , po - v ,Dist - ranchi , state - karnatak , resion - india");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).click();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("www.google.com");
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
	    }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.quit();
  }

}
