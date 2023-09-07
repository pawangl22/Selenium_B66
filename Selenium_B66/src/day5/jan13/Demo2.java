package day5.jan13;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		Dimension currentBrowserSize = driver.manage().window().getSize();
		System.out.println(currentBrowserSize);

		Point currentBrowserPosition = driver.manage().window().getPosition();
		System.out.println(currentBrowserPosition);

		Thread.sleep(1000);
		int count = 0;
		for (int i = 1; i <= 10; i++) {

			Point newPosition = new Point(100 + count, 100 + count);
			driver.manage().window().setPosition(newPosition);
			Thread.sleep(500);
			count = count + 50;

		}
		driver.quit();

	}

}
