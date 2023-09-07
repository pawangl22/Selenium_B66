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

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Duration scriptTimeOut = driver.manage().timeouts().getScriptTimeout();
		System.out.println(scriptTimeOut);

		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));

		driver.get("https://demo.actitime.com/login.do");

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("document.getElementById('username').value='admin'");
		System.out.println("Done");

	}
}
