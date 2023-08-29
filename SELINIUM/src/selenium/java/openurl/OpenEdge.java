package selenium.java.openurl;


import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {
	public static EdgeDriver driver;
	public static void OpenEdgs () {
		driver= new EdgeDriver();
		driver.get("https://facebook.com");
		
	}
	public static void main(String[] args) {
		OpenEdgs();
	}

}
