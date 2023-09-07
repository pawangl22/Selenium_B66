package day26.feb09;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeGroups {
	
	@BeforeMethod(alwaysRun = true)
	public void login() {
		Reporter.log("Login", true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout() {
		Reporter.log("Logout", true);
	}
	
	@Test(groups = {"user", "smoke"})
	public void createUser() {
		Reporter.log("Create User", true);
	}
	
	@Test(groups = {"user", "smoke"})
	public void editUser() {
		Reporter.log("Edit User", true);
	}
	
	@Test(groups = {"user", "smoke"})
	public void deleteUser() {
		Reporter.log("Delete User", true);
	}

	
	@Test(groups = {"product"})
	public void createProduct() {
		Reporter.log("Create Product", true);
	}
	
	@Test(groups = {"product"})
	public void editProduct() {
		Reporter.log("Edit Product", true);
	}
	
	@Test(groups = {"product"})
	public void deleteProduct() {
		Reporter.log("Delete Product", true);
	}
	
	@Test(groups= {"bike"})
	public void addBike() {
		Reporter.log("Create Bike", true);
	}
	
	@Test(groups= {"bike"})
	public void removeBike() {
		Reporter.log("Edit Bike", true);
	}
	
	@Test(groups= {"bike"})
	public void copyBike() {
		Reporter.log("Delete Bike", true);
	}
}
