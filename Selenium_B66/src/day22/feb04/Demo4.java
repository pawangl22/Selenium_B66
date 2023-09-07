package day22.feb04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		// driver.findElement(By.id("username")).sendKeys("bhanu");

		//WebElement unTB = driver.findElement(By.id("username"));
		//unTB.sendKeys("bhanu");

		WebElement unTB;// declaration
		
		unTB = driver.findElement(By.id("username"));// initialization
		
		unTB.sendKeys("bhanu");// utilization

	}
}
