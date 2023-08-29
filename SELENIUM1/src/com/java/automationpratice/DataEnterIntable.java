package com.java.automationpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataEnterIntable {
		public static WebDriver driver;
	public static void openurl () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	public static void Enter () {
		driver.findElement(By.id("name")).sendKeys("MR Unique");
		driver.findElement(By.id("email")).sendKeys("MrHacker888@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9438089748");
		driver.findElement(By.id("textarea")).sendKeys("At - u , po - v ,Dist - ranchi , state - karnatak , resion - india");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).click();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("www.google.com");
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		openurl();
		Enter();
	}
}
