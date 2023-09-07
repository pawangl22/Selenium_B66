package day12.jan24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Demo3 {
//Relative locator - in selenium4 we can find element w.r.t some other element
//toLeftOf toRightOf above below near
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample7.html");
		Thread.sleep(1000);
		//in relative locator 1st we need to find IE
		WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(java)).click();
		
		String cost = driver.findElement(with(By.tagName("td")).toRightOf(java)).getText();
		System.out.println(cost);
		
		String heading=driver.findElement(with(By.tagName("th")).above(java)).getText();
		System.out.println(heading);
		
		
		String nextSub=driver.findElement(with(By.tagName("td")).below(java)).getText();
		System.out.println(nextSub);
		driver.quit();
	}
}