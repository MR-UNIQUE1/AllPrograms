package youtube;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class X_path {
	public WebDriver driver;

	@Test
	public void f() {
		String str1 = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println("Text available on link:" + str1);

		String str2 = driver.findElement(By.name("btnI")).getAttribute("value");
		System.out.println("Text available on button:" + str2);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}

}
