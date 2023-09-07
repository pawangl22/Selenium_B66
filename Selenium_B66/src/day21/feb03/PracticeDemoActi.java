package day21.feb03;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemoActi {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		
		Set<String> allWHS = driver.getWindowHandles();
		for(String wh : allWHS) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}

		driver.findElement(By.xpath("//a[text()='Get started']")).click();
		
	}

}
