package day14.jan26;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo5 {
//Scrolling
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//Scroll down
		for (int i=1; i<=5; i++)
		{
			j.executeScript("window.scrollBy(0, 200)");
			Thread.sleep(1000);
		}
		//Scroll up
		for (int i=1; i<=5; i++)
		{
			j.executeScript("window.scrollBy(0, -200)");
			Thread.sleep(1000);
		}

	}

}
