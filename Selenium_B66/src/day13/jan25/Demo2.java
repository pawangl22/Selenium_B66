package day13.jan25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample9.html");
		Thread.sleep(500);
		boolean textBox = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(textBox);
		
		boolean button = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(button);
		
		boolean checkBox = driver.findElement(By.id("A5")).isSelected();//yes true
		System.out.println(checkBox);
		
		boolean checkBox2 = driver.findElement(By.id("A6")).isSelected();//no false
		System.out.println(checkBox2);
		
		boolean textBox2 = driver.findElement(By.id("A1")).isEnabled();//yes true
		System.out.println(textBox2);
		
		boolean textBox3 = driver.findElement(By.id("A4")).isEnabled();//no false
		System.out.println(textBox3);
		

	}
}
