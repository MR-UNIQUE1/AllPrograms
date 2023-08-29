package selenium.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenFacebook {
	public static WebDriver driver;
	public static void openChrome () {
		ChromeOptions options = new ChromeOptions() ;
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void ValueEnter () {
		driver.findElement(By.name("email")).sendKeys("66666666666");
		driver.findElement(By.name("pass")).sendKeys("777777");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	public static void main(String[] args) {
		openChrome();
		ValueEnter();
		
	}
}