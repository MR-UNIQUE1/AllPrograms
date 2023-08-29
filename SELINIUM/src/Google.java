import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static WebDriver driver;
	
	public static void gg() {
		driver= new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().minimize();
	}
	public static void Googlde() throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("pawan kalyana");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	}
	public static void main(String[] args) throws Exception {
		Googlde();
		gg();
	}

}
