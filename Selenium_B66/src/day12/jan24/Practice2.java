package day12.jan24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;


public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample7.html");
		Thread.sleep(1000);
		
		WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(java)).click();
		
		String cost = driver.findElement(with(By.tagName("td")).toRightOf(java)).getText();
		System.out.println(cost);
		
		String heading = driver.findElement(with(By.tagName("th")).above(java)).getText();
		System.out.println(heading);
		
		String nextSub = driver.findElement(with(By.tagName("td")).below(java)).getText();
		System.out.println(nextSub);
		
		driver.quit();
	}

}
