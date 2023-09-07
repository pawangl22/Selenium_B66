package day13.jan25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample9 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample9.html");
		
		WebElement name = driver.findElement(By.id("A1"));
		name.clear();
		name.sendKeys("Pawan");
		Thread.sleep(3000);
		driver.findElement(By.id("A2")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
