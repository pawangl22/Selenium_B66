package day20.feb02;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFileUpload1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		
		String relativePath = "./data/Selenium.xlsx";
		File file = new File(relativePath);
		String absolutePath = file.getAbsolutePath();
		
		driver.findElement(By.id("A2")).sendKeys(absolutePath);
	}

}
