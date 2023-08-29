package selenium.java.openurl;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Sleeper;

@SuppressWarnings("unused")
public class GoogleSearch {
	public static WebDriver driver;
	
	public static void openURL () {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver (chromeOptions);
		driver.get("https:/google.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void ClickHindi() throws Exception{
		driver.findElement(By.linkText("हिन्दी")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("ਪੰਜਾਬੀ")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	public static void main(String[] args) throws Exception {
		openURL();
		ClickHindi();
	}

}
