package com.mr.project.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenUrl {
	public WebDriver driver;
	
	public void LunchBrowser (String browser , String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
				ChromeOptions s = new ChromeOptions();
				s.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(s);
		} else if(browser.equalsIgnoreCase("FireFox")){
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("IE")|| browser.equalsIgnoreCase("InternetExplorer")) {
			driver= new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
}
