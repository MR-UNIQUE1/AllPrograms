package com.java.openurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenFreeAutomation {
	
	public static WebDriver dri;
	public static void OpenGoogle () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		dri = new ChromeDriver(s);
		dri.get("https://testautomationpractice.blogspot.com");
		dri.manage().window().maximize();
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws InterruptedException {
		OpenGoogle();

	}

}
