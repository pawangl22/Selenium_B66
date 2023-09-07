package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleAssert {

	@Test
	public void runner() {
		String a="abc";
		String b="abb";
		
		if(a.equals(b)) {
			Reporter.log("Pass... ", true);
		}else
			Reporter.log("Fail....", true);
			Assert.fail();
			
			Reporter.log("Waiting....", true);
	}
	
}
