package day26.feb09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeAll {
	

	@Test(groups= {"smoke", "reression"}, priority=5) 
	public void testA() {
		Reporter.log("Create customer", true);
	}

	@Test(groups= {"smoke"}, priority=4)
	public void testB() {
		Reporter.log("edit customer", true);
	}
	
	@Test(priority=3)
	public void testC() {
		Reporter.log("delete customer", true);
	}
	
	@Test(groups= {"reression"}, priority=6)
	public void testD() {
		Reporter.log("update customer", true);
	}
	
	@Test
	public void testE() {
		Reporter.log("add customer", true);
	}
	
	@Test(groups= {"smoke", "reression"}, priority=7)
	public void testF() {
		Reporter.log("remove customer", true);
	}
	
	@Test(priority = 1)
	public void testG() {
		Reporter.log("alter customer", true);
	}
	
	@Test
	public void runAssertion() {
		
		Reporter.log("Open Browser", true);
		Reporter.log("close Browser", true);
		
		String actR = "abc";
		String expR = "abc";
		
		if (actR==expR) {
			Reporter.log("Working fine", true);
		}
		else {
			Reporter.log("Not Working", true);
			Assert.fail();
		}
		
		Assert.assertEquals(actR,expR);
		
		Reporter.log("Loading.....", true);
	}

}
