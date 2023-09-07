package day27.feb10;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void testA() throws MalformedURLException {
		URL url = new URL("http://192.168.29.22:4444");
		ChromeOptions chrome = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(url, chrome);
		driver.get("http://www.google.com");
		driver.quit();
//		DesiredCapabilities capabilities=new DesiredCapabilities();
//		capabilities.setBrowserName("chrome");
//		WebDriver driver=new RemoteWebDriver(url, capabilities);

	}
}
