package day21.feb03;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClosingSpecificBrowser {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String expectedBorwser = s.next();
		s.close();
		String msg="Browser not found";
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Set<String> allWHS = driver.getWindowHandles();
		
		for( String wh : allWHS) {
			driver.switchTo().window(wh);
			String actualBrowser = driver.getTitle();
			if(expectedBorwser.equalsIgnoreCase(actualBrowser)) {
				msg="Browser found";
				driver.close();
			}
		}
		System.out.println(msg);

	}

}
