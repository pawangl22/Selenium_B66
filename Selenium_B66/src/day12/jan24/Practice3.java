package day12.jan24;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample7.html");
		Thread.sleep(1000);
		
		//WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(By.xpath("//td[.='Java']"))).click();
	
		Thread.sleep(1000);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample8.html");
		driver.findElement(with(By.tagName("input")).toRightOf(By.xpath("//td[.='Java']"))).click();
		Thread.sleep(1000);
		driver.findElement(with(By.tagName("input")).near(By.xpath("//td[.='SQL']"))).click();
		
	}

}
