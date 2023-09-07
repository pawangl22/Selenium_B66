package day21.feb03;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo4 {
//Perform the action on the element present in the child browser
//Can we close all the browser -> Quit or close inside loop
//Can we close only parent browser -> close (without switchto)
// can we close specific browser -> if inside loop->close
//close only child browser -this code
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		String parent=driver.getWindowHandle();
		
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS= driver.getWindowHandles();
		allWHS.remove(parent);
		
		for(String w:allWHS)
		{
			driver.switchTo().window(w);
			String title=driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(title);
		}
		
	}

}
