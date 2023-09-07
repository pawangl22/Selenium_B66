package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample13 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample13.html");
		Thread.sleep(2000);
		
		List<WebElement> listBox = driver.findElements(By.xpath("//input[@type='text']"));
		int count = listBox.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			WebElement box1 = listBox.get(i);
			box1.sendKeys("A");
		}
		
		for (WebElement box : listBox) {
				box.sendKeys("B");
		}
	}

}
