package projectTDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//This is not a part of a code it is a Separate code


public class jj {
	public  static WebDriver driver;
	public static void login() throws Exception{
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	public static void Enter_Info() throws Exception{
		driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]")).click();
		
		driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

		driver.findElement(By.xpath("//span[@title='delete']")).click();
		driver.findElement(By.xpath("//div[@class='input-group-append input-group-required']//div[@role='listbox']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Guests']")).click();
	}
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\drivers\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(s);
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		login();
		Enter_Info();
	}
}
