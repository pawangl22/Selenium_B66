package day15.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample11.html");
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("Pawan");
		Thread.sleep(1000);
		driver.switchTo().frame(0); //Go inside the first frame
		driver.findElement(By.id("t2")).sendKeys("Kumar");
	}

}
