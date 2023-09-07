package day20.feb02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFileDownload2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		
		driver.findElement(By.id("A3")).click();
		driver.findElement(By.id("PageLink_9")).click();
		driver.findElement(By.id("DirectLink_13")).click();

	}

}
