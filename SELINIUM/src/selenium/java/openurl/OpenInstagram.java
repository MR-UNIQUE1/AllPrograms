package selenium.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenInstagram {
	public static WebDriver driver;
	public static void OpenInstagramId() {
		driver= new ChromeDriver();
		driver.get("http://www.instagram.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void Verify() throws Exception {
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("7735688331");
		driver.findElement(By.name("password")).sendKeys("7752033606");
			Thread.sleep(3000);
		driver.findElement(By.cssSelector("div._ab8w._ab94._ab99._ab9f._ab9m._ab9p._abak._abb8._abbq._abb-._abcm")).click();
		Thread.sleep(8000);
	}
	public static void Click() throws Exception {
		driver.findElement(By.cssSelector("button._acan._acao._acas._aj1-")).click();
		Thread.sleep(9000);
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("svg._ab6-")).click();
	}
	public static void main(String[] args) throws Exception {
		OpenInstagramId();
		Verify();
		Click();
	}
}
