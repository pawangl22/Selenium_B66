package practice.vanitha;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement button = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		int y = button.getLocation().getY();
		System.out.println(y);
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,"+y+")");
		button.click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		driver.quit();	
	}
}
