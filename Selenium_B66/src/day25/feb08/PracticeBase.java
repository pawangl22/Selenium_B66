package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PracticeBase {
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);		
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
	}

}
