package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider2 {
	
	@DataProvider
	public Integer[] getData() {
		Integer num[] = {20, 100, 400, 500};
		return num;
	}
	
	@Test(dataProvider = "getData")
	public void test(Integer num) {
		Reporter.log("Printing number from dataprovider = "+num, true);
		
	}

}
