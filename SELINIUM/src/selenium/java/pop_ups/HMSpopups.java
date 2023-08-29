package selenium.java.pop_ups;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMSpopups {
	
	public static WebDriver driver ;
	public static void OpenHms() {
		driver= new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
	public static void Verify () throws InterruptedException {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		Thread.sleep(3000);
	}
	public static void Register () throws InterruptedException {
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		driver.findElement(By.name("PATIENT_CAT")).sendKeys("Staff Dependent");
		Thread.sleep(3000);
	}
	public static void Feedback() throws InterruptedException {
		driver.findElement(By.linkText("Feedback")).click();
		 Set<String> windows= driver.getWindowHandles();
		 Object [] s = windows.toArray();
		 driver.switchTo().window(s[1].toString());
		 driver.findElement(By.id("name")).sendKeys("sunil");
		 driver.findElement(By.id("email")).sendKeys("sunil@dd");
		 Thread.sleep(6000);
		 driver.close();
		 driver.switchTo().window(s[0].toString());
		 driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[14]/td[2]/input")).sendKeys("hydrabad");
		 Thread.sleep(5000);
		 driver.findElement(By.name("submit")).click();
	}
	public static void main(String[] args) throws Exception {
		OpenHms();
		Verify();
		Register();
		Feedback();
	}

}
