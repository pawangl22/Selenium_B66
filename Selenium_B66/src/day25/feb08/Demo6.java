package day25.feb08;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Demo6 {
	    
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("login",true);
  }

  @AfterMethod
  public void afterMethod()
  {
		  Reporter.log("logout",true);
 }
}
