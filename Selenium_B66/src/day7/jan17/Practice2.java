package day7.jan17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		driver.navigate().back();
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample2.html");
		
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		System.out.println(driver.getTitle());
		goBack(driver);
		
		driver.findElement(By.xpath("(//a[@class='c1'][2])")).click();
		System.out.println(driver.getTitle());
		goBack(driver);
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Google")).click();
		System.out.println(driver.getTitle());
		goBack(driver);
	}

}
