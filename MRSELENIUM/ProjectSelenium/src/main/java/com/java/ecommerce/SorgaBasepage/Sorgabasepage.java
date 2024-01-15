package com.java.ecommerce.SorgaBasepage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sorgabasepage {
	public WebDriver driver;
	public static final String path = "./Sorga.properties";
	public  String getData(String key) throws Exception {
		File f=new File(path);
		FileInputStream fi = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fi);
		return p.getProperty(key);
	}
	
	 public void browserLunch (String browser , String url ) {
			if (browser .equalsIgnoreCase("chrome")) {
				 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
					ChromeOptions s = new ChromeOptions();
					s.addArguments("--remote-allow-origins=*");
					driver = new ChromeDriver(s);
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
				driver= new FirefoxDriver();
			} 
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\internetexploredriver.exe");
				driver = new InternetExplorerDriver();
			}
			
			driver.get(url);
			driver.manage().window().maximize();
		}
}
