package day4.jan12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void testBrowser(WebDriver driver) {
		driver.get("http://www.google.com");// enter the url
		String title = driver.getTitle();// get the title
		System.out.println(title);// print the title
		driver.quit();// close the browser
	}

	public static void main(String[] args) {

		WebDriver driver1 = new ChromeDriver();
		Demo2.testBrowser(driver1);

		WebDriver driver2 = new FirefoxDriver();
		Demo2.testBrowser(driver2);

	}

}
