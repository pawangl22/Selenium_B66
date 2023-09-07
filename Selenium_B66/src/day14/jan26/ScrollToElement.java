package day14.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.actitime.com/");
		
		WebElement quiz = driver.findElement(By.xpath("//a[contains(text(),'Quiz')]"));
		Thread.sleep(3000);
		int loc = quiz.getLocation().getY();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0, "+ loc +")");
		Thread.sleep(1000);
		driver.quit();
	}

}
