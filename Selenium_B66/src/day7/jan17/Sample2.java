package day7.jan17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample2 {

	public static void goBack(WebDriver driver) {
		driver.navigate().back();
	}
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("file:///D:/Akshara%20Training/HTML/Sample2.html");
		driver.findElement(By.xpath("//a[@class=\"c1\"][1]")).click();
		System.out.println(driver.getTitle());
		
		goBack(driver);
		
		driver.findElement(By.xpath("//a[@name=\"n1\"][2]")).click();
		System.out.println(driver.getTitle());
		
		goBack(driver);
		

	}

}
