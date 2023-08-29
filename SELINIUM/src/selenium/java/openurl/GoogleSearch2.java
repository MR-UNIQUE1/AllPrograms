package selenium.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch2 {
	
	public static WebDriver driver ;
	
	public static void lunch () {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}
	public static void put () throws Exception {
		driver.findElement(By.name("email")).sendKeys("7752033606");
		driver.findElement(By.id("pass")).sendKeys("12312300");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}
	public static void main(String[] args) throws Exception{
		lunch();
		put();	
	}
}
