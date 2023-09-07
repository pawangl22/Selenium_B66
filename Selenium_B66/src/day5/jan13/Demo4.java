package day5.jan13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		WebElement searchTextBox = driver.switchTo().activeElement();
		searchTextBox.sendKeys("Akshara training");
	}

}
