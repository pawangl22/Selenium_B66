package day24.feb07;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleProgramTest {
	
	@Test(invocationCount = 5)
	public void testBrowser() {
		Reporter.log("Hi, Pawan. Printing only in report");
		Reporter.log("Hi, Vanitha. Printing both in report and console", true);
	}

}
