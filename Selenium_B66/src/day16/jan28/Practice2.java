package day16.jan28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> tagList = driver.findElements(By.tagName("a"));
		int count = tagList.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			System.out.print(i +" ");
			WebElement list = tagList.get(i);
			boolean displayed = list.isDisplayed();
			System.out.print(displayed +" ");
			String tagName = list.getText();
			System.out.println(tagName);
		}
	}

}
