package practice.pawan;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetPosition {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://www.google.com");

		int count = 0;
		for (int i = 0; i <= 10; i++) {
			Point newPosition = new Point(100+ count, 100+ count);
			driver.manage().window().setPosition(newPosition);
			count = count+50;
		}
		driver.quit();
	}

}
