package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeAssert {
	
	@Test
	public void test() {
		Reporter.log("Open the browser", true);
		Reporter.log("Enter UN and PWD", true);
		Reporter.log("Load home page", true);
		
		String extResult = "Home";
		String actResult = "Home";
		
		if (extResult.equalsIgnoreCase(actResult)) {
			Reporter.log("Pass", true);
		}
		else {
			Reporter.log("Fail", true);
			Assert.fail();
		}
	}

}
