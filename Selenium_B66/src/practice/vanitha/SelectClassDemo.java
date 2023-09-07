package practice.vanitha;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement listBox = driver.findElement(By.id("month"));
		Select s1 = new Select(listBox);
		s1.selectByIndex(3);
		Thread.sleep(2000);
		s1.selectByVisibleText("Aug");
		Thread.sleep(2000);
		s1.selectByValue("1");
		Thread.sleep(2000);
		
		System.out.println(s1.isMultiple());
		
		List<WebElement> opts = s1.getOptions();
		int count = opts.size();
		System.out.println(count);
		
		for( WebElement month : opts) {
			System.out.println(month.getText());
		}
		
//		for(int i=0; i<count; i++)
//		{
//			WebElement month = opts.get(i);
//			String monthName = month.getText();
//			System.out.println(monthName);
//		}
		
	}

}
