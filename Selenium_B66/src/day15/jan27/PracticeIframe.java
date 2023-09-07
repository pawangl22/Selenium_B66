package day15.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeIframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample11.html");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("A");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("A");
		
		Thread.sleep(1000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("B");

		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='sample12.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t2")).sendKeys("C");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("C");
		
	}

}
