package day27.feb10;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeGrid3 {
	
	@Parameters({ "browser", "remoteURL"})
	@Test
	public void test(@Optional("chrome") String browser, String remoteURL) throws InterruptedException, MalformedURLException {

		WebDriver driver;
		URL url = new URL(remoteURL);
		if (browser.equals("chrome")) {
			
			ChromeOptions chrome = new ChromeOptions();
			driver = new RemoteWebDriver(url, chrome);
			} 
		else 
		{
			
			FirefoxOptions firefox = new FirefoxOptions();
			driver = new RemoteWebDriver(url, firefox);
			driver.manage().window().setPosition(new Point(700, 10));
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setSize(new Dimension(600, 600));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).sendKeys("Pawan");
			Thread.sleep(1000);
		}
		
		driver.quit();
	}


}
