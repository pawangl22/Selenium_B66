package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample113 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample13.html");
		Thread.sleep(2000);

		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='text']"));
		int boxCount = boxes.size();

		for (int i = 0; i < boxCount; i++) {
			boxes.get(i).sendKeys("A");
		}

		for (WebElement box : boxes) {
			box.sendKeys("B");

		}
		Thread.sleep(3000);

	}

}
