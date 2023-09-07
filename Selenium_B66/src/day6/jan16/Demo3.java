package day6.jan16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///D:/Akshara%20Training/PK%20-%20JavaSelenium/Selenium_BhanuSir/programs/Day6/HTML/Sample1.html");
		System.out.println(driver.getTitle());

		driver.findElement(By.tagName("b")).click();

		System.out.println(driver.getTitle());
	}
}
