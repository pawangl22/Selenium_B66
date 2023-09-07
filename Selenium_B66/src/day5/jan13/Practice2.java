package day5.jan13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailFiled = driver.switchTo().activeElement();
		emailFiled.sendKeys("Pawan");
		emailFiled.sendKeys(Keys.TAB);
		
		WebElement pwdField = driver.switchTo().activeElement();
		pwdField.sendKeys("Kumar");
		pwdField.sendKeys(Keys.ENTER);

	}

}
