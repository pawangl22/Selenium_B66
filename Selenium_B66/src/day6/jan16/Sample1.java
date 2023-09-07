package day6.jan16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample1.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pSource = driver.getPageSource();
		System.out.println(pSource);
		
		driver.findElement(By.id("a1")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@class=\"c1\"]")).click();

	}

}
