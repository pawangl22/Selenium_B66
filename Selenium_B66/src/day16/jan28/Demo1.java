package day16.jan28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		for (int i = 1; i <= 3; i++) {
			actions.scrollByAmount(0, 500).perform();
			Thread.sleep(1000);
		}

		for (int i = 1; i <= 3; i++) {
			actions.scrollByAmount(0, -500).perform();
			Thread.sleep(1000);
		}

	}
}