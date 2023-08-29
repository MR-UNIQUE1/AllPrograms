package com.java.ecommerce.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.ecommerce.basepage.Lunching_Browser;

public class LoginHRM extends Lunching_Browser{
	@FindBy (name = "username") WebElement txtUsername ;
	@FindBy(name = "password") WebElement txrPassword ;
	@FindBy(xpath  = "//button[@type='submit']") WebElement btnLOgin;
	
	public LoginHRM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginHRMM () throws Exception {
		Thread.sleep(4000);
		txtUsername.sendKeys(getData("username"));
		txrPassword.sendKeys(getData("password"));
		btnLOgin.click();
	}
}
