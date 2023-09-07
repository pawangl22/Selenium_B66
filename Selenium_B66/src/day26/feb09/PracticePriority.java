package day26.feb09;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticePriority {
	
	@Test (priority=1)
	public void registerProduct() {
		Reporter.log("Register", true);
	}

	@Test (priority=2)
	public void editProduct() {
		Reporter.log("Edit", true);
	}
	
	@Test (priority=3)
	public void deleteProduct() {
		Reporter.log("Delete", true);
	}

}
