package day7.jan17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.cssSelector("div [class='FPdoLc lJ9FBc'] input[value='I'm Feeling Lucky']")).click();
//
//		goBack(driver);

		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Hello song by Adele" + Keys.ENTER);
		System.out.println(driver.getTitle());
		goBack(driver);
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Kempegowda airport" + Keys.ENTER);
		System.out.println(driver.getTitle());
	}

}
