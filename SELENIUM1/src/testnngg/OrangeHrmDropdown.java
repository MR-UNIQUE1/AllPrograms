package testnngg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class OrangeHrmDropdown {
	public static WebDriver driver;
  @Test(priority = 0)
  public void login() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(2000);
  }
  @Test(priority = 1)
  public void Droopdown () {
	WebElement tt= new Select( driver.findElement(By.cssSelector("p.oxd-userdropdown-name"))) .getFirstSelectedOption();
	System.out.println(tt.getText());
  }
  @BeforeTest 
 	public void beforetest ()  throws InterruptedException {
 		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
 		ChromeOptions s = new ChromeOptions();
 		s.addArguments("--remote-allow-origins=*");
 		driver = new ChromeDriver(s);
 		driver.get("https://opensource-demo.orangehrmlive.com/");
 		driver.manage().window().maximize();
 		Thread.sleep(3000);
 		}

}
