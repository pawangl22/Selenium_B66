package day25.feb08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P12DimString {
	
	@DataProvider
	public String[][] getData() {
		
		String[][] name = new String[3][2];
		name[0][0]= "Lattafa";
		name[0][1]="Casio";
		
		name[1][0]="Mic";
		name[1][1]="Vector";
		
		name[2][0]="Run";
		name[2][1]="Walk";
		return name;
	}
	
	@Test(dataProvider="getData")
	public void test(String n, String p) {
		System.out.println(n + " - " + p );
	}

}
