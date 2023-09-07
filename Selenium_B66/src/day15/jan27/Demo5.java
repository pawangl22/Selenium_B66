package day15.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {
//Context Menu
//Context Click-right clicking on the element->contextClick method of Actions class
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
	}

}
