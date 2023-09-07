package day15.jan27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		Thread.sleep(1000);
		
		WebElement expertise = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(expertise).perform();
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu c-menu-type-inline']/li"));
		for( WebElement menu: list) {
			System.out.println(menu.getText());
		}
	}

}
