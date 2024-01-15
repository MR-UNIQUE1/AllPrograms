package com.java.project.pageUIS;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.project.basepage.LunchGoogle;

public class SearchInGoogle extends LunchGoogle{
	public static final Logger log = Logger.getLogger(SearchInGoogle.class.getName());
	
	@FindBy(name = "q")WebElement srhAny;
	public SearchInGoogle(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public void enter () throws Exception {
		log.info("*********google search willl be strated8*************");
		srhAny.sendKeys(getData("sh"));
		
		srhAny.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
}
