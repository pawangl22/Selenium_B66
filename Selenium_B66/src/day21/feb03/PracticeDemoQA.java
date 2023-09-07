package day21.feb03;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeDemoQA {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
		WebElement target = driver.findElement(By.xpath("//h5[contains(text(),'Alert')]"));
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();
		driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][3]")).click();
		
		WebElement browserWindows = driver.findElement(By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Browser')]"));
		action.moveToElement(browserWindows).perform();
		wait.until(ExpectedConditions.visibilityOf(browserWindows));
		driver.findElement(By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Browser')]")).click();
		driver.findElement(By.id("windowButton")).click();
		Set<String> allWHS = driver.getWindowHandles();
		int count = allWHS.size();
		System.out.println(count);
		
		for(String wh : allWHS) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}

}
