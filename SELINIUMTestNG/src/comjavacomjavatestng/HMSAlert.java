package comjavacomjavatestng;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class HMSAlert {
	
	public WebDriver driver ;
	
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver ();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }
	
  @Test(priority = 1)
  public void f() {
	  driver.findElement(By.linkText("HMS")).click();
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
  }
  @Test(priority = 2)
public void SON() throws Exception {
	  Thread.sleep(4000);
	driver.findElement(By.linkText("Registration")).click();
	driver.findElement(By.linkText("Perminent Registration")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("PATIENT_CAT")).sendKeys("self");
	driver.findElement(By.name("RELATION")).sendKeys("Brother");
	driver.findElement(By.name("TITLE")).sendKeys("Mr");
	driver.findElement(By.name("MOTHER_NAME")).sendKeys("Hiraben Modi");
	driver.findElement(By.name("PNT_NAME")).sendKeys("Narendra");
	driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Damoderdas");
	driver.findElement(By.name("LAST_NAME")).sendKeys("Modi");
	driver.findElement(By.name("PAT_IDENTITY")).sendKeys("AAdhar Card");
	driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("524015302612");
	driver.findElement(By.name("DOB")).sendKeys("17-09-1950");
	driver.findElement(By.name("AGE")).sendKeys("73");
	driver.findElement(By.name("SEX")).sendKeys("Male");
	driver.findElement(By.name("MTRL_STATUS")).sendKeys("Single");
	driver.findElement(By.name("RELIGION")).sendKeys("Hindu");
	driver.findElement(By.name("PLANGUAGE")).sendKeys("Hindi");
	driver.findElement(By.name("NATIONALITY")).sendKeys("Indian");
	driver.findElement(By.name("IS_MLC")).sendKeys("Yes");
	driver.findElement(By.name("EDUCATION")).sendKeys("B.Sc");
	driver.findElement(By.name("OCCUPATION")).sendKeys("Self Employeed");
	driver.findElement(By.name("BLOOD_GRP_CODE")).sendKeys("O+");
	driver.findElement(By.name("CITIZENSHIP")).sendKeys("Indian");
	driver.findElement(By.name("SC_PROOF")).sendKeys("Yes");
	driver.findElement(By.name("ADDRESS1")).sendKeys("hydrabad");
	driver.findElement(By.name("MOBILE_NO")).sendKeys("7735688333");
	driver.findElement(By.name("image")).sendKeys("C:\\Users\\SONU\\Pictures\\Saved Pictures\\download (1).jfif");
	driver.findElement(By.name("COUNTRY_CODE")).sendKeys("India");
	driver.findElement(By.name("ZIP")).sendKeys("719278");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
}
  @Test(priority = 3)
public void MOON() throws Exception {
	  String s = driver.switchTo().alert().getText();
	  System.out.println(s);
	  driver.switchTo().alert().accept();
}
}
