package selenium.java.openurl;
import org.openqa.selenium.By;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLang {	
	public static WebDriver driver ;
	public static void OpenGoogle () {
		driver= new ChromeDriver ();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	public static void ClickLinks (String strings) throws Exception {
		driver.findElement(By.xpath(strings)).click();
		Thread.sleep(3000); 
	}
	public static void main(String[] args) throws Exception {
		OpenGoogle();
		ClickLinks("//*[@id='SIvCob']/a[1]");
		ClickLinks("//*[@id=\"SIvCob\"]/a[4]");
	}
}
