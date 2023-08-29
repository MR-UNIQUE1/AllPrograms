package com.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_Login_logout_facebook {
		public static WebDriver driver ;
		public static void openUrl() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(4000);
		}
		
		public static void login () throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7752033606");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12312300");
			driver.findElement(By.name("login")).click();
			Thread.sleep(4000);
		}
		public static void verify() {
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='image'][1]"));
			
		}
		public static void logout () {
			
		}
		
	public static void main(String[] args) throws InterruptedException {
		openUrl();
		login();
		verify();

	}

}
