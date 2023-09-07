package day21.feb03;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
//perform the action on the elements present in the child browser
// can we close all the browser--> quit or close inside loop
//can we close only parent--> close (without any switchto)
// can we close specific browser -> if inside loop->close
//close only child browser -this code
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String parent=driver.getWindowHandle();
		
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS= driver.getWindowHandles();
		allWHS.remove(parent);
		
		for(String w:allWHS)
		{
			driver.switchTo().window(w);
			driver.close();
		}
		
	}

}
