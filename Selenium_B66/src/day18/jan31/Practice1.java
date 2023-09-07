package day18.jan31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample15.html");
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select = new Select(listBox);
		select.selectByIndex(3);
		select.selectByValue("c");
		select.selectByVisibleText("Bangalore");

		System.out.println(select.isMultiple());
		if (select.isMultiple()) {
			System.out.println("Multiple");

		} else {
			System.out.println("Single");
		}

	}

}
