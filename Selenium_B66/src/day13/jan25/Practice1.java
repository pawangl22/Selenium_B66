package day13.jan25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample9.html");
		
		WebElement a1 = driver.findElement(By.id("A1"));
		WebElement a2 = driver.findElement(By.id("A2"));
		WebElement a3 = driver.findElement(By.id("A3"));
		WebElement a4 = driver.findElement(By.id("A4"));
		WebElement a5 = driver.findElement(By.id("A5"));
		WebElement a6 = driver.findElement(By.id("A6"));
		WebElement a7 = driver.findElement(By.id("A7"));
		WebElement a8 = driver.findElement(By.id("A8"));
		
		Thread.sleep(500);
		System.out.println(a1.getText());
		a1.clear();
		Thread.sleep(1000);
		a1.sendKeys("Pawan Kumar");
		Thread.sleep(500);
		System.out.println(a1.getText());
		
		System.out.println(a2.getTagName());
		System.out.println(a2.getText());
		System.out.println(a2.isDisplayed());
		//a2.click();
		
		System.out.println(a3.isEnabled());
		
		System.out.println(a4.isDisplayed());
		System.out.println(a4.isEnabled());
		
		a5.click();
		Thread.sleep(500);
		System.out.println(a5.isSelected());
		a5.click();
		System.out.println(a5.isSelected());
		
		
		a6.click();
		a7.click();
		a8.submit();
	}

}
