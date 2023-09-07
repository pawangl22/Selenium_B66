package day26.feb09;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParameters {
	
	@Parameters({"city","pin"})
	@Test
	public void test(String city, String pin) {
		Reporter.log(city + " - " +pin, true);
	}

}
