package com.java.openurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenGooglee {
	public static WebDriver driver;
	
	public static void Chromes () {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	public static void Firefoxs () {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	public static void Id () {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		Chromes();
		Firefoxs();
		Id();
	}

}
