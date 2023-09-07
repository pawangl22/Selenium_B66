package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7 {

	@Test
	public void createUser() {
		Reporter.log("createUser", true);
		//Assert.fail();
	}

	@Test(dependsOnMethods = "createUser")
	public void deleteUser() {
		Reporter.log("deleteUser", true);

	}

}
