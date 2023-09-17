package objects;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import com.java.dataEntry.Login_and_logout;
public class Sorga1 extends Login_and_logout {

	public Sorga1(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws Exception {
		Logger log = LogManager.getLogger(Sorga1.class.getName());
		log.info("***************Browser opening ***************");
		browserlunch(getData("browser"), getData("url"));
		
		Login_and_logout s = new Login_and_logout(driver);
		s.login();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
