package day13.jan25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample9.html");
		WebElement textBox = driver.findElement(By.id("A1"));
		Thread.sleep(500);
		textBox.clear();
		textBox.sendKeys("Pawan");
	}
}
