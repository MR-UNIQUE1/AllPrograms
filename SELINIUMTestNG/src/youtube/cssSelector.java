package youtube;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class cssSelector {
	public WebDriver driver;
  @Test(priority = 2)
  public void f() throws Exception {
	  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("7752033606");
	
	  driver.findElement(By.cssSelector("input[data-testid=royal_pass]")).sendKeys("12312300");
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy[name=login]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();
  }

}
