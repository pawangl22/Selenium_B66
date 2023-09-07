package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeDependsOn {
	
	@Test
	public void createUser() {
		Reporter.log("Create user", true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "createUser")
	public void deleteUser() {
		Reporter.log("Delete user", true);
		Assert.fail();
	}

}
