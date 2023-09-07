package day12.jan24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample7.html");

		driver.findElement(By.xpath("//td[.='Java']/../td[1]/input")).click();
		driver.findElement(By.xpath("//td[.='Java']/preceding-sibling::td/input")).click();

	}

}
