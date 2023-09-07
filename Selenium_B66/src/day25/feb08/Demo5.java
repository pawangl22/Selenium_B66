package day25.feb08;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Demo5 {

	@Test
	public void f() {
		Reporter.log("create customer", true);
	}

	@Test(invocationCount = 1)
	public void g() {
		Reporter.log("edit customer", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("login", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("logout", true);
	}
}
