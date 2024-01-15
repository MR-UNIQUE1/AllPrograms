package linksCount;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GoogleLinkss {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No.of available links:" + links.size());
		int count = 0;
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getText().isEmpty()) {
				System.out.println(links.get(i).getText());
				Thread.sleep(1000);
				count++;
			}
		}
		System.out.println("Visible links are:" + count);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
}