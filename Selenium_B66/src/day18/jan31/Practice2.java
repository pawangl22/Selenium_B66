package day18.jan31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Practice2 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample15.html");
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select = new Select(listBox);

		List<WebElement> textList = select.getOptions();
		for (WebElement text : textList) {
			System.out.println(text.getText());
		}

		System.out.println("-----------------");
		for (int i = textList.size() - 1; i >= 0; i--) {
			System.out.println(textList.get(i).getText());
		}

		System.out.println("-----------------");

		String text = select.getWrappedElement().getText();
		System.out.println(text);

	}

}
