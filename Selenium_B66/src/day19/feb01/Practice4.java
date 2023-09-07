package day19.feb01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select = new Select(listBox);
		
		List<WebElement> allOption = select.getOptions();
		ArrayList<String> allText = new ArrayList<String>();
		
		for( WebElement option : allOption) {
			allText.add(option.getText());
		}
		
		Collections.sort(allText);
		System.out.println(allText);

	}

}
