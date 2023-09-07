package day21.feb03;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS= driver.getWindowHandles();
		int count =allWHS.size();
		System.out.println(count);
		
		for(String w:allWHS)
		{
			System.out.println(w);
		}
		
		driver.quit();
	}

}
