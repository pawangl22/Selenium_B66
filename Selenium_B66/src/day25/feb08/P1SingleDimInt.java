package day25.feb08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P1SingleDimInt {
	
	@DataProvider
	public Integer[] getData() {
		Integer[] num = {100, 501, 201, 403};
		return num;
	}
	
	@Test(dataProvider="getData")
	public void test(Integer num) {
		System.out.println(num);
	}

}
