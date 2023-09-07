package day15.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {
//Drop down menu
//Mouse hover - placing the mouse pointer on the element -> MoveToElment method of Actions class
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));

		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(text(),'MS Office Plug-ins')]")).click();

	}

}
