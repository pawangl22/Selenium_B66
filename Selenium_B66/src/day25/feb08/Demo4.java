package day25.feb08;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Data PRovider method must return array (1D 2D) or collection
//run the test method multiple times with diff inputs 
public class Demo4 {

	@DataProvider
	public Iterator<String[]> getData() {
		ArrayList<String[]> data = new ArrayList<String[]>();

		String[] s1 = { "A1", "B1" };
		data.add(s1);

		String[] s2 = { "A2", "B2" };
		data.add(s2);

		String[] s3 = { "A3", "B3" };
		data.add(s3);

		Iterator<String[]> idata = data.iterator();

		return idata;

	}

	@Test(dataProvider = "getData")
	public void testA(String s, String p) {
		Reporter.log(s + " - " + p, true);
	}
}
