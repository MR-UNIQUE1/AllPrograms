package youtube;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ID {
	public WebDriver  driver ;
  @Test (priority = 1)
  public void f() throws Exception {
	int count= driver.findElements(By.className("css-9pa8cd")).size();
	System.out.println("numbers of the pages are available in this page is"+count);
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
  }

}
