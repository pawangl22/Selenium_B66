package day24.feb07;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2 {
	
	@Test
	public void google(){
		System.out.println("Printing google in console");
		Reporter.log("Printing google on repot");
		Reporter.log("Printing google in report and console both", true);
		Reporter.log("Printing google in report2", false);
	}

}
