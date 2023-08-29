package com.java.ecommerce.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
	public WebDriver driver;
	public static final String path = "./config.properties";
	
	public String getData1(String key1) throws Exception {
		File fff = new File(path);
		FileInputStream ss = new FileInputStream(fff);
		Properties a = new Properties();
		a.load(ss);
		return a.getProperty(key1);
	}
	
	public String getData(String key) throws Exception {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Properties p= new Properties();
		p.load(fi);
		return p.getProperty(key);
	}
	
	public void browserLunch (String browser , String url ) {
		if (browser .equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\LIBRARY\\geckodriver.exe");
			driver= new FirefoxDriver();
		} 
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "d:\\LIBRARY\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
	}
	
}