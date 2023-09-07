package day27.feb10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParallel1 {

	@Parameters({ "browser" })
	@Test
	public void test(@Optional("chrome") String browser) throws InterruptedException {

		WebDriver driver;

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
			driver.manage().window().setPosition(new Point(700, 10));
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setSize(new Dimension(600, 600));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.name("username")).clear();
			Thread.sleep(500);
			driver.findElement(By.name("username")).sendKeys("Pawan");
			Thread.sleep(500);
		}
		
		driver.quit();
	}

}
