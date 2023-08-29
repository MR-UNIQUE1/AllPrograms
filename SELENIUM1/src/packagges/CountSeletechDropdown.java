package packagges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountSeletechDropdown {
	public static WebDriver driver;
  @Test
  public void f() {
	
	WebElement er  = driver.findElement(By.id("dropdown-class-example"));
		List<WebElement>yy=	er.findElements(By.tagName("options"));
		System.out.println("Number of values in DD"+ yy.size());
		for (int i = 0; i < yy.size(); i++) {
			System.out.println(yy.get(i).getText());
		}
	}
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://seletech.in/practice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}
