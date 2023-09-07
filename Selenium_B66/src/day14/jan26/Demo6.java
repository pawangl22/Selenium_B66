package day14.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo6 {
//Scroll to specific element
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.actimind.com/");
		WebElement ourClient = driver.findElement(By.xpath("//h3[contains(text(),'Our client')]"));
		int y = ourClient.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollTo(0, "+y+")");
		Thread.sleep(2000);
		driver.quit();
	}

}
