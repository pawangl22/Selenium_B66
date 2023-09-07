package day25.feb08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P1SingleDim {
	
	@DataProvider
	public String[] getData() {
		String name[] = {"Pawan", "Vanitha", "Arya"};
		return name;
	}
	
	@Test(dataProvider="getData")
	public void runner(String name) {
		System.out.println(name);
	}

}
