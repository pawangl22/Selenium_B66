package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider1 {

	@DataProvider
	public String[] getData() {
		String name[] = {"Pawan", "Vanitha", "Arya"};
		return name;
	}
	
	@Test(dataProvider="getData")
	public void test(String name) {
		Reporter.log("name is printing = "+name, true);
	}
}
