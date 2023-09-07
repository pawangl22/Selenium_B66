package day21.feb03;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleProgramWH {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html?");
		driver.findElement(By.id("A5")).click();
		Set<String> wh = driver.getWindowHandles();
		wh.remove(parentWindow);
		
		for( String window : wh) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			WebElement chW = driver.findElement(By.xpath("//input[@type='text']"));
			chW.sendKeys(title);
			driver.close();
		}

		//driver.quit();
	}

}
