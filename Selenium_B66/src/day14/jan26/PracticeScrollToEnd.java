package day14.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScrollToEnd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		Thread.sleep(10000);
		WebElement forYou = driver.findElement(By.xpath("//span[@jsname='V67aGc']/..//a"));
		j.executeScript("window.scrollTo(0, "+forYou+")");
	}

}
