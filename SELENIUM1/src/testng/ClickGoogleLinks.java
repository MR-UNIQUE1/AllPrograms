package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickGoogleLinks {
	public static WebDriver driver;
	public void clicks (String links) {
		driver.findElement(By.xpath(links)).click();
		driver.findElement(By.linkText("English")).click();
	}
	@Test
	public void test(){
		clicks("//*[@id=\"SIvCob\"]/a[1]");
		clicks("//*[@id=\"SIvCob\"]/a[2]");
		clicks("//*[@id=\"SIvCob\"]/a[3]");
		clicks("//*[@id=\"SIvCob\"]/a[4]");
	}
	@BeforeTest 
	public void beforetest ()  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@AfterTest 
	public void aftertest() {
		driver.quit();
		
	}
}