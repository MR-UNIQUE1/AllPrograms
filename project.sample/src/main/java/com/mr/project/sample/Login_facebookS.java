package com.mr.project.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_facebookS {
	public WebDriver driver ;
	
	@FindBy (xpath = "//*[@id=\"email\"]") WebElement txtUsername;
	@FindBy(xpath = "//*[@id=\"pass\"]") WebElement txtPassword ;
	@FindBy (name = "login") WebElement btnjjLogin ; // something goes to wrong
	
	public Login_facebookS(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginF()throws Exception{
		Thread.sleep(3000);
		txtUsername.clear();
		txtUsername.sendKeys("7752033606");
		Thread.sleep(2000);
		txtPassword.clear();
		txtPassword.sendKeys("12312300");
		Thread.sleep(2000);
		btnjjLogin.click();		// error has been ocupied in this line
		
	}
}
