package selenium.java.pop_ups.selenium.java.pop_ups;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HMSpopupsTest {
	public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
  }

  @Test
  public void FeedbackTest() throws Exception {
	  driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }
}
  

