package day12.jan24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Practice5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample8.html");
		System.out.println(driver.findElement(By.xpath("//td[.='Java']/../td[2]/input")).isSelected());
		driver.findElement(By.xpath("//td[.='Java']/../td[2]/input")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//td[.='Java']/../td[2]/input")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//td[.='Java']/../td[3]")).getText());
		
		WebElement sql = driver.findElement(By.xpath("//td[.='SQL']"));
		driver.findElement(with(By.tagName("input")).toRightOf(sql)).click();
	}

}
