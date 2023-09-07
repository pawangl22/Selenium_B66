package day19.feb01;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo6 {
//search for the given option in list box ->Agra -Found   Mumbai-Not Found
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter city name to search:");
		String eCity = sc.next();
		sc.close();

		String msg = "Not Found";

		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select = new Select(listBox);
		int i = 0;
		for (WebElement option : select.getOptions()) {
			String aCity = option.getText();
			if (aCity.equalsIgnoreCase(eCity)) {
				msg = "Found @ index:" + i;
				break;
			}
			i++;
		}

		driver.quit();

		System.out.println(eCity + " " + msg);
	}
}
