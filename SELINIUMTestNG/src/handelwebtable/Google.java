package handelwebtable;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Google {
	public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver ();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(1000);
  }
  @Test
  public void g () {
	  String s =driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]")).getText();
	  System.out.println(s);
	  String[] t = s.split("\n");
	  for (int i = 0; i < t.length; i++) {
			if (t[i].equalsIgnoreCase("selenium webdriver")) {
				driver.findElement(By.name("q")).clear();
				driver.findElement(By.name("q")).sendKeys(t[i]);
				driver.findElement(By.name("btnK")).click();
			}
		}
  }
 
}
