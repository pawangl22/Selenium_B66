package day24.feb07;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	void testA() {
		System.out.println("Printing only in console, Executing TestA of Demo4");
		Reporter.log("Printing only in report, Executing TestA of Demo4");
		Reporter.log("Printing in both report and console, Executing TestA of Demo4", true);
		Reporter.log("Printing only in report, Executing TestA of Demo4", false);
	}

}
