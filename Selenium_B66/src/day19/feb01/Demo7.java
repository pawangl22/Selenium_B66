package day19.feb01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {
//print the content of the list box in sorted order
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select = new Select(listBox);

		List<WebElement> allOptions = select.getOptions();

		List<String> allText = new ArrayList<String>();

		for (WebElement option : allOptions)// for each can be used on any class which implements Iterable interface
		{
			allText.add(option.getText());
		}

		Collections.sort(allText);// sort method can be used on any class which implements Comparable interface

		System.out.println(allText);

		driver.quit();

//		for(int i=0;i<allOptions.size();i++)
//		{
//			String text = allOptions.get(i).getText();
//			allText.add(text);
//		}

	}
}
