
package day16.jan28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		Thread.sleep(1000);
		WebElement ourClient = driver.findElement(By.xpath("//h3[contains(text(),'Our client')]"));
		Actions action = new Actions(driver);

		action.scrollToElement(ourClient).perform();
		
	}

}
