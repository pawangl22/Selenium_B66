package day15.jan27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightAndDouble {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//Right Click
		WebElement right = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions action = new Actions(driver);
		action.contextClick(right).perform();
		Thread.sleep(2000);
		
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		WebElement box = driver.findElement(By.id("box"));
		System.out.println(box.getText());
		
		//DoubleClick
		WebElement dClick = driver.findElement(By.xpath("//input[@type='button']"));
		action.doubleClick(dClick).perform();
		System.out.println(box.getText());
		
		//Drag and Drop
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement b1 = driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
		WebElement b2 = driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]"));
		WebElement b3 = driver.findElement(By.xpath("//h1[contains(text(),'Block 3')]"));
		action.dragAndDrop(b1, b2).perform();
		
		//Click and Hold
		action.clickAndHold(b3).moveToElement(b1).release().perform();
		action.clickAndHold(b2).moveToElement(b3).pause(Duration.ofSeconds(20)).release().perform();
	}

}
