package day21.feb03;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeChildWindow1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		
		driver.findElement(By.id("A5")).click();
		Set<String> multiWindows = driver.getWindowHandles();
		for( String window : multiWindows) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		driver.quit();

	}

}
