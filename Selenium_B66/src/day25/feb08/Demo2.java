package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Data PRovider method must return array (1D 2D) or collection
//run the test method multiple times with diff inputs 
public class Demo2 {

	@DataProvider
	public String[] getData()
	{
		String data[]={"Amit","Bhanu","Chandana"};
		return data;
	}
	
	@Test(dataProvider = "getData" )
	public void testA(String s)
	{
		Reporter.log(s,true);
	}
}
