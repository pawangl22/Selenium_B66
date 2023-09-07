package day7.jan17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///D:/Akshara%20Training/PK%20-%20JavaSelenium/Selenium_BhanuSir/programs/Day7/HTML/Sample2.html");
		System.out.println(driver.getTitle());

		driver.findElement(By.tagName("A")).click();

		System.out.println(driver.getTitle());
	}
}
