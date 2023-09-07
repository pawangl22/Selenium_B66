package day25.feb08;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider6 {
	
	@DataProvider
	public Iterator<Integer[]> getData() {
		ArrayList<Integer[]> data = new ArrayList<Integer[]>();
		
		Integer[] num1 = {10, 20};
		data.add(num1);
		
		Integer[] num2 = {30, 40};
		data.add(num2);
		
		Integer[] num3 = {50, 60};
		data.add(num3);
		
		Iterator<Integer[]> idata = data.iterator();
		return idata;
	}
	
	@Test(dataProvider="getData")
	public void test(Integer n1, Integer n2) {
		Reporter.log("Printing data in = "+n1 +" - " + n2, true);
	}

}
