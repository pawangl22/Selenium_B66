package day25.feb08;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider5 {
	
	@DataProvider
	public Iterator<String[]> getData() {
		
		ArrayList<String[]> data = new ArrayList<String[]>();
		String[] s1 = {"A1", "B1"};
		data.add(s1);
		
		String[] s2 = {"A2", "B2"};
		data.add(s2);
		
		String[] s3 = {"A3", "B3"};
		data.add(s3);
		
		Iterator<String[]> idata = data.iterator();
		return idata;
		
	}
	
	@Test(dataProvider = "getData")
	public void test(String s, String p) {
		Reporter.log("Printing data in = "+s +" - " +p, true);
	}

}
