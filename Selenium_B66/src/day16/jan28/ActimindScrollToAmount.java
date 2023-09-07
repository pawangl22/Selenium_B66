package day16.jan28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActimindScrollToAmount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.actimind.com/");
		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		for (int i = 1; i <= 5; i++) {
			actions.scrollByAmount(0, 200).perform();
		}
		Thread.sleep(2000);
		
		WebElement uiux = driver.findElement(By.xpath("(//a[contains(text(),'UI/UX Design')])[2]"));
		actions.scrollToElement(uiux).perform();
		driver.quit();
	}

}
