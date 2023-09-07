package day21.feb03;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//closing the specific browser
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Plz enter the title:");
		Scanner sc=new Scanner(System.in);
		String eTitle=sc.next();
		sc.close();
		String msg="Sorry Browser not found";
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS= driver.getWindowHandles();
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			String aTitle=driver.getTitle();
			if(aTitle.equalsIgnoreCase(eTitle))
			{
				msg="Browser found & closing it";
				driver.close();
			}
		}
		
		System.out.println(msg);
		
		
	}

}
