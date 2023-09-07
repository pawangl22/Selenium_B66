package day21.feb03;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePerformActionOnSpecificBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String parent = driver.getWindowHandle();
		
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);
		
		for(String wh : allWHS) {
				driver.switchTo().window(wh);
				String title = driver.getTitle();
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(title);
			
		}
				driver.quit();
		}

}
