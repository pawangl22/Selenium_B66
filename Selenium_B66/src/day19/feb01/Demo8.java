package day19.feb01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("java");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.name("q"));
		Select select=new Select(search);
		select.selectByIndex(1);
	}
}
