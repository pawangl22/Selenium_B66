package day4.jan12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestChromeAndFireFox {

	public static void testBrowser(WebDriver driver1) {
		driver1.get("http://www.google.com");
		String title = driver1.getTitle();
		System.out.println(title);
		driver1.quit();
	}
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver1 = new ChromeDriver(options);
		TestChromeAndFireFox.testBrowser(driver1);
		
		WebDriver driver2 = new FirefoxDriver();
		TestChromeAndFireFox.testBrowser(driver2);
		

	}

}
