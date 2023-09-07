package day19.feb01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAlert6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		//driver.findElement(By.id("A1")).click();

		try {
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert Present");
		} catch (Exception e) {
			System.out.println("Not Present");
		}

		driver.quit();
	}

}
