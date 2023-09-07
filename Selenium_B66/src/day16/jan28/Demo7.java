package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample5.html");
		List<WebElement> allcells = driver.findElements(By.xpath("//th | //td "));
		
		for ( WebElement cell : allcells) {
			System.out.println(cell.getText());
		}
		driver.quit();
	}

}
