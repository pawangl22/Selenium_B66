package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider3 {
	
	@DataProvider
	public String[][] getData() {
		String[][] data = new String[2][1];
		data[0][0] = "A1";
	//	data[1][1] = "B1";
		
		data[1][0] = "A2";
//		data[2][2] = "B2";
		return data;
	}
	
	@Test(dataProvider="getData")
	public void test(String alpha) {
		Reporter.log("Printing data in = "+alpha, true);
	}

}
