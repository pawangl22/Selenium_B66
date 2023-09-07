package day25.feb08;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class PracticeBeforeAfterMethod {
	
	@DataProvider
	public String[] getData() {
		String[] name = {"Pawan", "Arya"};
		return name;
	}

	@Test
	public void f() {
		Reporter.log("Create Customer", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Login", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logout", true);
	}

	@Test
	public void f1() {
		Reporter.log("Edit Customer", true);
	}
	
	@Test(invocationCount = 2)
	public void f2() {
		Reporter.log("Update Customer Phone number", true);
	}
	
	@Test(dataProvider="getData")
	public void f3(String n) {
		Reporter.log("Delete Customer "+n, true);
	}
}
