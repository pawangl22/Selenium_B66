package day13.jan25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample9.html");
		Thread.sleep(500);
		driver.findElement(By.id("A2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("A6")).click();
		driver.findElement(By.id("A7")).click();
		
	}
}
