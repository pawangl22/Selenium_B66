package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	@Test(invocationCount=3)
	public void runner() {
		Reporter.log("Printing only in report", false);
		Reporter.log("Printing in console", true);
		Reporter.log("Printing only in report");
	}

}
