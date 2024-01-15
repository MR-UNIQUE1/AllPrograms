package youtube;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Tag {
	public WebDriver driver;
  @Test
  public void f() {
	  int a =driver.findElements(By.tagName("a")).size();
	  System.out.println("the number of links are present in google is" + a);
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new  ChromeDriver();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
  }

}
