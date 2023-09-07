package day18.jan31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Duration pageLoadaMaxTime = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(pageLoadaMaxTime);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		try 
		{
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Page is loaded within 10s");
		}
		catch (Exception e) 
		{
			System.out.println("Page is not loaded within 10s");
		}
		System.out.println("End");
		
		
	}
}
