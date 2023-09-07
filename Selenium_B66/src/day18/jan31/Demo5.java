package day18.jan31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample15.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("A1"));

		Select select = new Select(listBox);
		select.selectByIndex(0);// select 2nd option-Bng
		Thread.sleep(1000);
		select.selectByValue("c");// select the option with the value 'c'
		Thread.sleep(1000);
		select.selectByVisibleText("Kashmir");
	}

}
