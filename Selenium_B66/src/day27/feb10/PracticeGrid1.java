package day27.feb10;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class PracticeGrid1 {
	
	@Test
	public void test() throws MalformedURLException {
		
		URL url = new URL("http://192.168.29.22:4444");
		ChromeOptions chrome = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(url, chrome);
		driver.get("http://www.google.com");
		driver.quit();
	}

}
