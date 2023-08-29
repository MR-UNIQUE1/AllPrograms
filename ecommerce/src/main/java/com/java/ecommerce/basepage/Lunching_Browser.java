package com.java.ecommerce.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Lunching_Browser {
	public WebDriver driver;
	public static final String path ="./HRMInfo.properties";
	
	public  String getData2(String key1) throws Exception {
		File s = new File(path);
		FileInputStream q = new FileInputStream(s);
		Properties p = new Properties();
		p.load(q);
		return p.getProperty(key1);
	}
	
	public String getData(String key) throws Exception {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		return pr.getProperty(key);
	}
	
	public void lb (String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
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
