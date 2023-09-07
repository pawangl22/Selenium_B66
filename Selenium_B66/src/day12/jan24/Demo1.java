package day12.jan24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample7.html");
		driver.findElement(By.xpath("//td[.='Java']/../td[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='Java']/preceding-sibling::td/input")).click();
	}

}
