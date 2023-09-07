package day15.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.actimind.com/");
		Thread.sleep(2000);

		WebElement area = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
		Actions action = new Actions(driver);
		action.moveToElement(area).perform();

		WebElement ms = driver.findElement(By.xpath("//a[contains(text(),'MS Office Plug-ins')]"));
		ms.click();
	}

}
