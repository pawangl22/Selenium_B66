package day26.feb09;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeMethod(alwaysRun = true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test(groups = {"smoke","user"})
	public void createUser(){
		Reporter.log("createUser",true);
	}

	@Test(groups = {"user"})
	public void editUser(){
		Reporter.log("editUser",true);
	}
	
	@Test(groups = {"user"})
	public void deleteUser(){
		Reporter.log("deleteUser",true);
	}
	
	@Test(groups = {"smoke","product"})
	public void createProuct(){
		Reporter.log("createProuct",true);
	}

	@Test(groups = {"product"})
	public void editProduct(){
		Reporter.log("editProduct",true);
	}
	
	@Test(groups = {"product"})
	public void deleteProduct(){
		Reporter.log("deleteProduct",true);
	}
}
