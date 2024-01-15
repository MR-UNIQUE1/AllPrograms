package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SerchCustomerPage;

public class Steps extends BaseClass{

	@Given("user lunch chrome browser")
	public void user_lunch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(s);
		lp= new LoginPage(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}
	@When("user enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String emails, String Passrd) {
		lp.emailEnter(emails);
		lp.passEnter(Passrd);
	}

	@When("click on login")
	public void click_on_login() {
		lp.clicklogin();
	}

	@Then("Page title should be  {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
		}
	@Then("page title should be  {string}")				//THis code may not be work 
	public void page_title_should_be1(String string) {	//if you face some problem then delete this method and also delete the feature steps
	   String actualRes = driver.getTitle();
	   if (actualRes.equals(string)) {
		Assert.assertTrue(true);
	}
	   else {
		   Assert.assertTrue(false);
	}
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		lp.clickLogout();
	}


	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}
	
	//Added New feature 
	@Then("user can view Dashboad")
	public void user_can_view_dashboad() {
	  adc = new AddCustomerPage(driver);
	  Assert.assertEquals("Dashboard / nopCommerce administration", adc.getPageTitle());
	}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		Thread.sleep(1000);
	   adc.clickOnCustomerMenu();
	}

	@When("click on customers menu item")
	public void click_on_customers_menu_item() throws InterruptedException {
		Thread.sleep(1000);
	   adc.ClickOnCustomerMenuItom();
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		Thread.sleep(1000);
	   adc.ClickAddNew();
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	   Assert.assertEquals("Add a new customer / nopCommerce administration", adc.getPageTitle());
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
	   String RdEmaills= randomsEmail()+"@gmail.com";
	   adc.SetEmail(RdEmaills);
	   adc.SetPassword("Test2123");
	   adc.SetCustomerRoles("Guests");
	   Thread.sleep(1000);
	   adc.setManagerVender("Vendor 2");
	   adc.setGender("Male");
	   adc.firstName("Mr");
	   adc.lastName("Unique");
	   adc.setDOB("3/03/2023");			//Format dd/mm/yyyy
	   adc.setCompanyName("TCS");
	   adc.SetAdminCommet("This is for personal information");
	   
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(1000);
	   adc.ClickOnSave();
	   Thread.sleep(2000);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String SaveMessage) {
	   Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
			   .contains("The new customer has been added successfully."));
	}
	//Search customers by using email id
	
	@When("Enter customer email")
	public void enter_customer_email() {
	  page = new SerchCustomerPage(driver);
	  page.SearchEmail("kiyjcycyhjc676008@gmail.com");
	}

	@When("click on search buttom")
	public void click_on_search_buttom() throws InterruptedException {
	    page.clickSearch();
	    Thread.sleep(2000);
	}

	@Then("user should found email in the search table")
	public void user_should_found_email_in_the_search_table() {
	   boolean status =page.searchCustomerByEmail("kiyjcycyhjc676008@gmail.com");
	   Assert.assertEquals(true, status);
	}
}
