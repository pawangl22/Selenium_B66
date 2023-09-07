package day12.jan24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

//All the methods of Relative Locators are overloaded
public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample8.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='Java']/..//input")).click();
	
		driver.get("file:///D:/Akshara%20Training/HTML/Sample7.html");
		driver.findElement(By.xpath("//td[.='SQL']/..//input")).click();		
	}
}
