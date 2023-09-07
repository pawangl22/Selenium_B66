package day5.jan13;

import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBActiveElement {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver  = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement un = driver.switchTo().activeElement();
		un.sendKeys("Pawan");
		un.sendKeys(Keys.TAB);
		
		WebElement pwd = driver.switchTo().activeElement();
		pwd.sendKeys("pws");
		pwd.sendKeys(Keys.ENTER);
		
		Point cPosition = driver.manage().window().getPosition();
		
		int count = 0;
		
		for(int i=0; i<=15; i++) {
			Point p = new Point(count +50, count +50);
			driver.manage().window().setPosition(p);
			count=count+50;
		}
	}

}
