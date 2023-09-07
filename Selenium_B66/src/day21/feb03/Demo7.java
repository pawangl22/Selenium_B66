package day21.feb03;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	
	//only in selenium 4
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//goto google.com
		driver.get("http://www.google.com");
		//open new tab- get all whs and switch to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//goto fb.com
		driver.get("http://www.fb.com");
		
		driver.quit();
		Thread.sleep(1000);
		driver=new ChromeDriver();
		//goto google.com
		driver.get("http://www.google.com");
		//open new window- get all whs and switch to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//goto fb.com
		driver.get("http://www.fb.com");
		
	}

}
