package selenium.java.selenium.java.pop_ups;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GoogleLanguage {
	
	public static WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver ();
		driver.get("https:/google.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  }

  @Test
  public void f() {
	  driver.findElement(By.linkText("हिन्दी")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("ਪੰਜਾਬੀ")).click();

  }
  
  @AfterTest
  public void afterTest() {
  }

}
