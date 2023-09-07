package day25.feb08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P12DimInt {
	
	@DataProvider
	public Integer[][] getData() {
		Integer[][] num = new Integer[4][2];
		num[0][0]=10;
		num[0][1]=20;
		
		num[1][0]=30;
		num[1][1]=40;
		
		num[2][0]=50;
		num[2][1]=60;
		
		num[3][0]=70;
		num[3][1]=80;
		
		return num;
	}

	@Test(dataProvider="getData")
	public void test(Integer n, Integer m) {
		System.out.println(n + " - " +m);
	}
}
