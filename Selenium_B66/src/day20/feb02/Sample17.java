package day20.feb02;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample17 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html?");
		
		String relativePath = "./data/Selenium.xlsx";
		File file = new File(relativePath);
		String absolutePath = file.getAbsolutePath();
		driver.findElement(By.id("A2")).sendKeys(absolutePath);

	}

}
