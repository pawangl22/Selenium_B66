package day26.feb09;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo8 {

	
	@Parameters({"city","pin"})
	@Test
	public void testA(String city,String pin)
	{
		Reporter.log(city+" "+pin,true);
	}
}
