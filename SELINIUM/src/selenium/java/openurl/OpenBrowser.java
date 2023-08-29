package selenium.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {
	public static WebDriver driver;
	public static void Openchrome() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		driver.get("https://youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public static void open () throws Exception{
		driver.findElement(By.id("search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("jira managment tools full course");
		
	}
	public static void main(String[] args) throws Exception{
		Openchrome();
		open();
	}
}