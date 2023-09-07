package day10.jan20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text' and not (@name='q')]")).sendKeys("8879782209");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.xpath("//input[@type='text' and (@name='q')]")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
