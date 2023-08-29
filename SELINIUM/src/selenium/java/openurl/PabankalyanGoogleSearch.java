package selenium.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PabankalyanGoogleSearch {
	public static WebDriver driver;

	public static void openURL() {
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	public static void googleSearch() throws Exception {
		driver.findElement(By.name("q")).sendKeys("pawan kalyan");
		Thread.sleep(10000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
	}
	public static void main(String[] args) throws Exception {
		openURL();
		googleSearch();
	}
}
