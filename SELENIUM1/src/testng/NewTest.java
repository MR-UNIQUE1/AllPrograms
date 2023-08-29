package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@Test 
	public void A () {
		System.out.println("It is a A method");
	}
	 @Test
	  public void C() {
		  System.out.println("It is a C method");
	  }
  @Test
  public void f() {
	  System.out.println("It is a method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("It is a before method ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("It is a after test ");
  }

}
