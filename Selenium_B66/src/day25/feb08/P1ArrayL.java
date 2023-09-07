package day25.feb08;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
public class P1ArrayL {
	
	@DataProvider
	public Iterator<String[]> getData() {
		ArrayList<String[]> city = new ArrayList<String[]>();
	
		String[] s1 = {"Dallas", "Sydney", "DDDD"};
		city.add(s1);
		String[] s2 = {"Ludiana", "Pondy", "NHNHN"};
		city.add(s2);
		String[] s3 = {"BMN", "JKS", "MKMK"};
		city.add(s3);
		String[] s4 = {"Kashmir", "Srinagar", "PLPLP"};
		city.add(s4);
	
		Iterator<String[]> iCity = city.iterator();
		return iCity;
	}

	@Test(dataProvider="getData")
	public void test(String c, String p, String n) {
		System.out.println(c  + " - " + p + " - " + n);
	}
}
