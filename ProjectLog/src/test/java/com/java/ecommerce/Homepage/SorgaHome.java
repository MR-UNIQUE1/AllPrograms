package com.java.ecommerce.Homepage;
import org.apache.logging.log4j.*;

import com.java.ecommerce.basepage.LunchBro;
import com.java.ecommerce.config.Login_logout_sorga;
public class SorgaHome extends LunchBro{

	public static void main(String[] args) throws Exception {
		
		Logger log = LogManager.getLogger(SorgaHome.class.getName());
		log.info("browser will be lunch ");
		SorgaBro(getData("browser"),getData("url"));
		
		Login_logout_sorga s = new Login_logout_sorga(driver);
		log.info("verify login and logout");
		s.verify();
		
		Thread.sleep(1000);
		driver.quit();
	}


}