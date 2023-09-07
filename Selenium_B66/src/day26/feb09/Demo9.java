package day26.feb09;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo9 {

	@Parameters({"browser"})
	@Test
	public void testA(String browser)
	{
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get("http://www.google.com");
		Reporter.log(driver.getTitle(),true);
		driver.quit();
	}
}
