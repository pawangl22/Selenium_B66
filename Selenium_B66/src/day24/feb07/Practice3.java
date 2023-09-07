package day24.feb07;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice3 {
	
	@Test
	public void ActiLogin() {
		Reporter.log("Printing only in report");
		Reporter.log("Printing in both report and console", true);
		Reporter.log("Printing only in report2", false);
	}

}
