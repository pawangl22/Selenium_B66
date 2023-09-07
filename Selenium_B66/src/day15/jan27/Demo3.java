package day15.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample11.html");
		Thread.sleep(1000);

		driver.switchTo().frame(0);// go inside the 1st frame-using index (int)
		driver.findElement(By.id("t2")).sendKeys("A");
		driver.switchTo().defaultContent();// exit from frame

		driver.findElement(By.id("t1")).sendKeys("A");

		// --------------------------------------------------

		driver.switchTo().frame("f1");// go inside the frame with id f1- using the id (String)
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().defaultContent();// exit from frame

		driver.findElement(By.id("t1")).sendKeys("B");

		// --------------------------------------------------

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='sample12.html']"));
		driver.switchTo().frame(frameElement);// using the frame element(WebElement)
		driver.findElement(By.id("t2")).sendKeys("C");
		driver.switchTo().parentFrame();// exit from frame
		
		driver.findElement(By.id("t1")).sendKeys("C");
	}
}