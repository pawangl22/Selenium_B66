package day20.feb02;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		Thread.sleep(1000);
		String relativePath = "./data/Selenium.xlsx";
		//driver.findElement(By.id("A2")).sendKeys("F:/B66/Selenium.xlsx");

		File f = new File(relativePath);
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);

		driver.findElement(By.id("A2")).sendKeys(absolutePath);
	}
}
