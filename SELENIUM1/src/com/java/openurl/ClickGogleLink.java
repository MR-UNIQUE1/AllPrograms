package com.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickGogleLink {
	public static WebDriver driver ;
	public static void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	public static void enter () throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("pm modi");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
	}
	public static void main(String[] args)throws InterruptedException {
		login();
		enter();

	}

}
