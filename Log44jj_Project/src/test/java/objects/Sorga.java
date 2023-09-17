/*package objects;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.dataEntry.Login_and_logout;

import basepage.Login_Sorga;
import org.apache.log4j.*;
public class Sorga extends Login_Sorga{
	public static final Logger log = Logger.getLogger(Sorga.class.getName());
	@AfterMethod
	public void aftermethod () throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
  @Test
  public void f() throws Exception {
	  log.info("*****************************************88");
	  Login_and_logout d = new Login_and_logout(driver);
	  d.login();
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	 
	 browserlunch(getData("browser"), getData("url"));
  }
}
*/