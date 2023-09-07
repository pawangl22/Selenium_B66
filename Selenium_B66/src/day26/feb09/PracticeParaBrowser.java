package day26.feb09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParaBrowser {

	@Parameters({ "browser" })
	@Test
	public void testBrowser(@Optional("chrome") String browser) {

		WebDriver driver;
		if (browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("http://www.google.com");
			Reporter.log(driver.getTitle(), true);
		} else {
			driver = new FirefoxDriver();
			driver.get("http://www.facebook.com");
			Reporter.log(driver.getTitle(), true);
		}
		
		driver.quit();

	}

}
