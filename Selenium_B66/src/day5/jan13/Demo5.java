package day5.jan13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		WebElement userName = driver.switchTo().activeElement();
		userName.sendKeys("admin");
		Thread.sleep(500);
		userName.sendKeys(Keys.TAB);

		WebElement pwd = driver.switchTo().activeElement();
		pwd.sendKeys("manager");
		pwd.sendKeys(Keys.ENTER);
	}
}
