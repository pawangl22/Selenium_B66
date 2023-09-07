package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import zmq.socket.reqrep.Rep;

public class Demo6 {

	@BeforeMethod
	public void openApp() {
		Reporter.log("open the browser", true);
	}

	@Test
	public void testLogin() {

		Reporter.log("Enter url", true);
		Reporter.log("Enter un & pwd, click login", true);
		String aT = "abc";
		String eT = "xyz";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(aT, eT);// compare
		Reporter.log("Waiting....", true);
		softAssert.assertAll();// reporting status
	}

	@AfterMethod
	public void closeApp() {
		Reporter.log("close the browser", true);
	}

}
