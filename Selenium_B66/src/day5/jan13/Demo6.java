package day5.jan13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		
		//find the un (active element)
		WebElement unTB = driver.switchTo().activeElement();
		
		//type 'admin'
		unTB.sendKeys("trainee");
		
		Thread.sleep(1000);
		unTB.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		unTB.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		unTB.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		WebElement pwTB = driver.switchTo().activeElement();
		pwTB.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		pwTB.sendKeys(Keys.ENTER);
		
	}
}
