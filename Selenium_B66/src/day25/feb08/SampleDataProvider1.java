package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider1 {

	@DataProvider
	public String[] getData() {
		String data[] = { "Pawan", "Vanitha", "Arya" };
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void runner(String s) {
		Reporter.log(s, true);
	}

}
