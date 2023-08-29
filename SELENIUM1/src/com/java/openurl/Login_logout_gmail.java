package com.java.openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_logout_gmail {
	
	public static WebDriver dri;
	public static void openUrl () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		dri = new ChromeDriver(s);
		dri.get("https://google.com");
		dri.manage().window().maximize();
		Thread.sleep(3000);
	}
	public static void opengmail() throws InterruptedException{
		dri.findElement(By.linkText("Gmail")).click();
		Thread.sleep(4000);
	}
	public static void main(String[] args) throws InterruptedException {
		openUrl();
		opengmail();
		}
}
