package day19.feb01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A3"));
		Select select = new Select(listBox);

		String text = select.getWrappedElement().getText();
		System.out.println(text);
		System.out.println("-----");

		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions)
			System.out.println(option.getText());
		System.out.println("-----");	

		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (WebElement option : selectedOptions)
			System.out.println(option.getText());
		System.out.println("-----");

		WebElement option = select.getFirstSelectedOption();
		System.out.println(option.getText());
		System.out.println("-----");

		driver.quit();
	}
}
