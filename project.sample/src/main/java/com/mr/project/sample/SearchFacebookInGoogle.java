package com.mr.project.sample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFacebookInGoogle {
	@FindBy(name = "q") WebElement txtInput ;
	@FindBy(name = "q") WebElement btnEnter ;
	
	public SearchFacebookInGoogle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void OpenFaceBook () {
		txtInput.sendKeys("facebook");
		btnEnter.sendKeys(Keys.ENTER);
	}
	
}
