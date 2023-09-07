package practice.pawan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethod {

	public static void testBrowser(WebDriver driver) {
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver1 = new ChromeDriver(options);
		testBrowser(driver1);

		WebDriver driver2 = new FirefoxDriver();
		testBrowser(driver2);
	}

}
