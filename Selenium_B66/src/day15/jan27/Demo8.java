package day15.jan27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {
//How to perform Drag and drop without using drag and drop method
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		Thread.sleep(1000);
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	
		Actions action =new Actions(driver);
		action.clickAndHold(block3).moveToElement(block4).release().perform();
		action.clickAndHold(block1).moveToElement(block4).pause(Duration.ofSeconds(20)).release().perform();
	}

}
