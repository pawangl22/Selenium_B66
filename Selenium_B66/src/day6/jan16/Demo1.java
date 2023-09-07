package day6.jan16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/Akshara%20Training/PK%20-%20JavaSelenium/Selenium_BhanuSir/programs/Day6/HTML/Sample1.html");

		String title = driver.getTitle();
		System.out.println(title);

		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);

		driver.quit();

	}

}
