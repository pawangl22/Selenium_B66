package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonLink {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		int count = linkList.size();
		System.out.println(count);
		
		for(int i=1; i< count; i++) {
			
			WebElement list = linkList.get(i);
			System.out.println(i + " ");
			boolean displayed = list.isDisplayed();
			System.out.println(displayed + " ");
			System.out.println(list.getText());
		}
	}

}
