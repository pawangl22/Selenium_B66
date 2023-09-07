package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class Demo3 {

	@Test
	public void testLogin() {
		Reporter.log("open the browser", true);
		Reporter.log("Enter url", true);
		Reporter.log("Enter un & pwd, click login", true);
		String aT = "abc";
		String eT = "abcc";
		if (aT.equals(eT)) {
			Reporter.log("Pass.....", true);
		} else {
			Reporter.log("Fail.....", true);
			Assert.fail();
		}
	}
}