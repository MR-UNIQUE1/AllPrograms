package testng;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ReadAllDataFromDropdown {
	public WebDriver driver;
  @Test
  public void f() {
	 List<WebElement> t= new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"))).getOptions();
	 System.out.println("The no of options available in dropdown is "+ t.size());
	 for (int i = 0; i <t.size(); i++) {
		System.out.println(t.get(i).getText());
	}
  }
  @BeforeTest
  public void beforeTest()  throws Exception{
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://seletech.in/practice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}
