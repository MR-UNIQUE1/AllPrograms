package com.java.ecommerce.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.ecommerce.basepage.AUTP_Basepage;
public class Entering_All_Data extends AUTP_Basepage{
	
	
	@FindBy(id = "name") WebElement txtName;
	@FindBy (id = "email") WebElement txtEmail;
	@FindBy(id = "phone") WebElement txtPh ;
	@FindBy(id = "textarea")WebElement txtAddr ;
	@FindBy (id = "Wikipedia1_wikipedia-search-input")WebElement srchTabs;
	@FindBy(xpath = "//input[@type='submit']")WebElement btnsearch;
	@FindBy(id = "male") WebElement rdbtnMen ;
	@FindBy(id="friday")WebElement rdbtnFriday ;
	
	public Entering_All_Data(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Entering_data () throws Exception {
		txtName.sendKeys(getData("name"));
		txtEmail.sendKeys(getData("firstname")+randomNumber()+ getData("domineName"));
		txtPh.sendKeys(getData("firstPh")+randomNumber());
		txtAddr.sendKeys(getData("addr"));
		srchTabs.sendKeys(getData("tab"));
		btnsearch.click();
		rdbtnMen.click();
		rdbtnFriday.click();
		
		
	}

}
