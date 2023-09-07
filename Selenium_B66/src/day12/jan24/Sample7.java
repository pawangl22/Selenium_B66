package day12.jan24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample7 {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample7.html");
		String text = driver.findElement(By.xpath("//td[.='SQL']/following-sibling::td")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//td[.='SQL']/preceding-sibling::td/input")).click();
		
		driver.get("file:///D:/Akshara%20Training/HTML/Sample8.html");
		driver.findElement(By.xpath("//td[.='Java']/../td/input")).click();
	}

}
