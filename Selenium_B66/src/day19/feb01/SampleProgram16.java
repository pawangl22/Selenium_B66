package day19.feb01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleProgram16 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");

		WebElement food2 = driver.findElement(By.id("A3"));
		Select select1 = new Select(food2);
		String fText = select1.getFirstSelectedOption().getText();
		System.out.println(fText);

		int count = select1.getOptions().size();
		for (int i = 0; i < count; i++) {
			String text = select1.getOptions().get(i).getText();
			System.out.println(text);
		}
		
		WebElement food1 = driver.findElement(By.id("A2"));
		Select select2 = new Select(food1);
		for( WebElement option : select2.getOptions()) {
			System.out.println(option.getText());
		}
		
		select2.selectByIndex(3);
		select1.deselectAll();
		
	}

}
