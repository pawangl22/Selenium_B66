package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample14CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample14.html");
		Thread.sleep(2000);

		List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = checkBoxList.size();

		for (int i = 0; i < count; i++) {
			WebElement box = checkBoxList.get(i);
			box.click();
		}

		for (int i = count-1; i >= 0; i--) {
			WebElement box = checkBoxList.get(i);
			box.click();

		}
		Thread.sleep(5000);
		driver.quit();
	}

}
