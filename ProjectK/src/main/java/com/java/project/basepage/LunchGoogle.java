package com.java.project.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LunchGoogle {
	public WebDriver driver;
	public static final String path = "./GoogleInfo.properties";
	public String logpat = "log4j2.properties";
	
	
	public String getData(String key) throws Exception {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fi);
		return p.getProperty(key);
	}

	 public void Gbrowser(String browser, String url) throws Exception{
			if (browser .equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
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
			Thread.sleep(2000);
			PropertyConfigurator.configure(logpat);
		}
	
}
