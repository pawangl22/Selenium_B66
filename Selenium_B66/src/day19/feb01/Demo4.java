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

public class Demo4 {
//select all the options present in multi-select list box
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		int count=select.getOptions().size();
		for(int i=0;i<count;i++) {
			select.selectByIndex(i);
			Thread.sleep(500);
		}
		
		for(int i=count-1;i>=0;i--) 
		{
			select.deselectByIndex(i);
			Thread.sleep(500);
		}
	
//		driver.quit();
	}
}
