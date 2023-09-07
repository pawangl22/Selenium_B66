package day18.jan31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample15.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("A1"));

		Select select = new Select(listBox);
		System.out.println(select.isMultiple());// false-check is it multi-select listbox or not

		if (select.isMultiple()) {
			System.out.println("It is a multi-select listbox");
		} else {
			System.out.println("It is a single Select listbox");
		}

		driver.quit();

	}

}
