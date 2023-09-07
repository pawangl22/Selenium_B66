
package day25.feb08;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test(invocationCount = 3)
	public void testA()
	{
		Reporter.log("Hi",true);
	}
}
