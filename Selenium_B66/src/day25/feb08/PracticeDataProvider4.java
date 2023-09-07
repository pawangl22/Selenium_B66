package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider4 {
	
	@DataProvider
	public Integer[][] getData() {
		
		Integer[][] data = new Integer[3][2];
		data[0][0]= 10;
		data[0][1]= 20;
		
		data[1][0]= 30;
		data[1][1]= 40;
		
		data[2][0]= 50;
		data[2][1]= 60;
		
		return data;
	}

	@Test(dataProvider="getData")
	public void test(Integer num, Integer num2) {
		Reporter.log("Printing data = " +num + " - " + num2, true);
	}
}
