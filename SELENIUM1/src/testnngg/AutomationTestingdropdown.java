package testnngg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTestingdropdown {
	public static WebDriver driver;
	@Test
	public void Switcht() {
	List<WebElement>u=	driver.findElements(By.tagName("iframe"));
	System.out.println("Number of frames are avalilavvle in this page "+ u.size());
	driver.switchTo().frame(0);
	}
  @Test ()
  public void Validate() {
	  List<WebElement> kk=new Select(driver.findElement(By.id("RESULT_RadioButton-3"))).getOptions();
	  System.out.println("The no of options is present in the dropdown "+ kk.size());
	  	for (int i = 0; i < kk.size(); i++) {
			System.out.println(kk.get(i).getText());
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
		JavascriptExecutor sd= (JavascriptExecutor) driver ;
		sd.executeScript("scroll(0,3000)");
		}

}
