package com.java.automationpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleLinksClick {
	
	public static WebDriver driver;
	public static void openurl () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	public static void clicks(String links) {
		driver.findElement(By.xpath(links)).click();
		driver.findElement(By.linkText("English")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		openurl();
		clicks("//*[@id=\"SIvCob\"]/a[1]");
		clicks("//*[@id=\"SIvCob\"]/a[2]");
		clicks("//*[@id=\"SIvCob\"]/a[3]");
		clicks("//*[@id=\"SIvCob\"]/a[4]");
	}
}
