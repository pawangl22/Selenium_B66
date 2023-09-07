package practice.pawan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiveElement {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.facebook.com");
		WebElement email = driver.switchTo().activeElement();
		email.sendKeys("Pawan");
		email.sendKeys(Keys.TAB);
		
		WebElement password = driver.switchTo().activeElement();
		password.sendKeys("Kumar");
		password.sendKeys(Keys.ENTER);
		
		driver.quit();
	}

}
