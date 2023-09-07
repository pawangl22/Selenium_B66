package day7.jan17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///D:/Akshara%20Training/PK%20-%20JavaSelenium/Selenium_BhanuSir/programs/Day7/HTML/Sample1.html");
		System.out.println(driver.getTitle());

		driver.findElement(By.tagName("A")).click();
		System.out.println(driver.getTitle());
		
		goBack(driver);
		
		driver.findElement(By.id("A1")).click();
		
		goBack(driver);
		
		driver.findElement(By.name("n1")).click();
		
		goBack(driver);
		
		driver.findElement(By.className("C1")).click();
		
		goBack(driver);
		
		driver.findElement(By.linkText("Google")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("oo")).click();
	}
}
