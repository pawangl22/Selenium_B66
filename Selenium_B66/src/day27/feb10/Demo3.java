package day27.feb10;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {

	@Parameters({ "browser", "remoteURL" })
	@Test
	public void testA(String browser, String remoteURL) throws Exception {
		WebDriver driver;
		Reporter.log(browser, true);
		URL url = new URL(remoteURL);

		if (browser.equals("chrome")) {
			ChromeOptions chrome = new ChromeOptions();
			driver = new RemoteWebDriver(url, chrome);
		} else {
			FirefoxOptions firefox = new FirefoxOptions();
			driver = new RemoteWebDriver(url, firefox);
			driver.manage().window().setPosition(new Point(700, 10));
		}

		driver.manage().window().setSize(new Dimension(600, 600));

		driver.get("https://demo.actitime.com/");
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.id("username")).clear();
			Thread.sleep(500);
			driver.findElement(By.id("username")).sendKeys("bhanu");
			Thread.sleep(500);
		}

		//driver.quit();
	}
}
