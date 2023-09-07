package day4.jan12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void testBrowser(ChromeDriver driver) {
		driver.get("http://www.google.com");// enter the url
		String title = driver.getTitle();// get the title
		System.out.println(title);// print the title
		driver.quit();// close the browser
	}

	public static void testBrowser(FirefoxDriver driver) {
		driver.get("http://www.google.com");// enter the url
		String title = driver.getTitle();// get the title
		System.out.println(title);// print the title
		driver.quit();// close the browser
	}

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		Demo1.testBrowser(driver);

		FirefoxDriver driver2 = new FirefoxDriver();
		Demo1.testBrowser(driver2);

	}

}
