package stepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.*;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SerchCustomerPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage adc;
	public static Logger logger;
	public SerchCustomerPage page;
	//This method is generate Unique email Id for every Customer
	public static String randomsEmail() {
		String randEmails = RandomStringUtils.randomAlphabetic(5);
		return randEmails;
	}
	
}
