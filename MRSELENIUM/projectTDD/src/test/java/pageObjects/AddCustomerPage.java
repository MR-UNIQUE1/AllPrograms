package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
	}
	By lnkCustomer_Menu = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By lnkCustomer_menu_itom= By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	By linkAdd_new = By.xpath("//a[@class='btn btn-primary']");
	By txtEmail= By.xpath("//input[@id='Email']");
	By txtPassword = By.xpath("//input[@id='Password']");
	By txtF_Name= By.xpath("//input[@id='FirstName']");
	By txtL_Name = By.xpath("//input[@id='LastName']");

	By btnGender_Male=By.xpath("//input[@id='Gender_Male']");
	By btnGender_Female=By.xpath("//input[@id='Gender_Female']");

	By txtDOB = By.xpath("//input[@id='DateOfBirth']");
	By txtCompany = By.xpath("//input[@id='Company']");
	By txtAdmin_Comment= By.xpath("//textarea[@id='AdminComment']");

	By txtCustomer_Roles = By.xpath("//div[@class='input-group-append input-group-required']//div[@role='listbox']");
	By lstitemResistration= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[4]");
	By lstitemAdminstration= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[1]");
	By lstitemModaretors= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[2]");
	By lstitemGuests= By.xpath("//li[normalize-space()='Guests']");
	By lstitemVenders = By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[5]");

	By drpmgrOfVender = By.id("VendorId");
	By rdbtnitexempt = By.id("IsTaxExempt");
	By rdbtnActive = By.id("Active");
	By lnkDelete = By.xpath("//span[@title='delete']");
	By btnSave= By.xpath("//button[@name='save']");
	//Action Method

	public void clickOnCustomerMenu() {
		ldriver.findElement(lnkCustomer_Menu).click();
	}
	public void ClickOnCustomerMenuItom() {
		ldriver.findElement(lnkCustomer_menu_itom).click();
	}
	public void ClickAddNew () {
		ldriver.findElement(linkAdd_new).click();
	}
	public void SetEmail(String email) {
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	public void SetPassword(String passwd) {
		ldriver.findElement(txtPassword).sendKeys(passwd);
	}
	public void SetCustomerRoles(String roles) {//Latter we can modify this code first we read all element from drop down then i user if statement 
		ldriver.findElement(lnkDelete).click();
		ldriver.findElement(txtCustomer_Roles).click();
		if (roles.equals("Administrators")) {
			ldriver.findElement(lstitemAdminstration).click();
		}
		else if (roles.equals("Forum Moderators")) {
			ldriver.findElement(lstitemModaretors).click();
		}
		else if(roles.equals("Guests")) {
			ldriver.findElement(lstitemGuests).click();
		}
		else if (roles.equals("Registered")) {
			ldriver.findElement(lstitemResistration).click();
		}
		else if (roles.equals("Vendors")) {
			ldriver.findElement(lstitemVenders).click();
		}else {
			ldriver.findElement(lstitemGuests).click();
		}
		
	}	
	public void setManagerVender (String value) {
		Select drp = new Select(ldriver.findElement(drpmgrOfVender));
		drp.selectByVisibleText(value);
	}
	public void setGender(String gender) {
		if (gender.equals("Male")) {
			ldriver.findElement(btnGender_Male).click();
		}
		else if (gender.equals("Female")) {
			ldriver.findElement(btnGender_Female).click();
		}
		else {
			ldriver.findElement(btnGender_Male).click();
		}

	}
	public void firstName (String Fname) {
		ldriver.findElement(txtF_Name).sendKeys(Fname);
	}
	public void lastName (String Lname) {
		ldriver.findElement(txtL_Name).sendKeys(Lname);
	}
	public void setDOB (String DOB) {
		ldriver.findElement(txtDOB).sendKeys(DOB);
	}
	public void setCompanyName (String comp) {
		ldriver.findElement(txtCompany).sendKeys(comp);
	}
	public void ClickOnSave() {
		ldriver.findElement(btnSave).click();
	}
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	public void SetAdminCommet(String Comments) {
		ldriver.findElement(txtAdmin_Comment).sendKeys(Comments);
	}
	
}















