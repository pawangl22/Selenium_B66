package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider2 {
	
	@DataProvider
	public String[][] getData(){
		String[][] data = new String[3][2];
		data[0][0]="A1";
		data[0][1]="B1";
		
		data[1][0]="A2";
		data[1][1]="B2";
		
		data[2][0]="A3";
		data[2][1]="B3";
		return data;
	}
	
	@Test(dataProvider= "getData")
	public void runner(String s, String p) {
		Reporter.log(s + " - " + p,true);
	}

}
