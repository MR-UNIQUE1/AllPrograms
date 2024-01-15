package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class NopCommerceHooks {
	@Before(order = 1)
	public void before_Browser() {
		System.out.println("Lunch the browser");
	}
	
	@Before(order = 2)
	public void before_Url() {
		System.out.println("Lunch The url");
	}
	@After (order = 2)
	public void after_Logout () {
		System.out.println("Logout the application ");
	}
	
	@After (order = 3)
	public void after_Browser() {
		System.out.println("Close the browser");
	}
}
