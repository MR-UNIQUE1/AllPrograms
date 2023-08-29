package com.java.openurl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandelPup_ups {
	public static WebDriver driver ;
	
	public static void openurl () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://www.globalsqa.com/demo-site");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	public static void openNewWindow() throws InterruptedException {
		
	//	s.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Windows")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Open New Window")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String>tt = driver.getWindowHandles();
		Object[] o = tt.toArray();
		driver.switchTo().window(o[1].toString());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-2806\"]/a/span[2]")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		openurl();
	    JavascriptExecutor sd= (JavascriptExecutor) driver ;
		sd.executeScript("scroll(0,3000)");
		
		openNewWindow();
		System.out.println("sunil");
	}
}
