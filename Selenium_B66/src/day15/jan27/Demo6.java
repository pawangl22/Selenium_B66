package day15.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		WebElement button = driver.findElement(By.xpath("//input[@type='button']"));
		String box1 = driver.findElement(By.id("box")).getText();
		System.out.println(box1);
		
		Actions action = new Actions(driver);
		action.doubleClick(button).perform();
		
		String box2 = driver.findElement(By.id("box")).getText();
		System.out.println(box2);
		
	}

}
