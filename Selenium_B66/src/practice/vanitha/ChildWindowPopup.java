package practice.vanitha;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh.size());
		System.out.println(wh);
		
		for(String window : wh)
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		//driver.quit();
	}

}
