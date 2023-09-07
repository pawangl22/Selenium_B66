package day14.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement buttomPage = driver.findElement(By.xpath("//span[text()='Gift Cards']"));
		int y = buttomPage.getLocation().getY();

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0, " + y + ")");

	}

}
