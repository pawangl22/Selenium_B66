package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeAssert2 {

	@BeforeMethod
	public void openBrowser() {
		Reporter.log("Open browser", true);
	}
	
	@AfterMethod
	public void closeBrowser() {
		Reporter.log("Close browser", true);
	}
	
	@Test
	public void test() {
		Reporter.log("Enter UN and PWD", true);
		Reporter.log("Load home page", true);
		
		String extResult = "Home";
		String actResult = "Home1";
		
		if (extResult.equalsIgnoreCase(actResult)) {
			Reporter.log("Pass", true);
		}
		else {
			Reporter.log("Fail", true);
			Assert.fail();
		}
		
		Reporter.log("Waiting...", true);
	}
}
