package day13.jan25;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.id("username"));
		
		File image = unTB.getScreenshotAs(OutputType.FILE);
		String loc = image.getAbsolutePath();
		System.out.println(loc);
		Thread.sleep(10000);
		driver.quit();
		
	}
}
