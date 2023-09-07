package day19.feb01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlert5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A1")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		driver.findElement(By.id("A1")).click();
	}

}
