package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample13.html");
		List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@type='text']"));
		int count = textBoxes.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement box1 = textBoxes.get(i);
			box1.sendKeys("a");
		}

		for (WebElement box : textBoxes) {
			box.sendKeys("b");
		}
	}

}
