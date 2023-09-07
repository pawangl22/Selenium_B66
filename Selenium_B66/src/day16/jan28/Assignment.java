package day16.jan28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");

		Thread.sleep(10000);
		List<WebElement> searchList = driver
				.findElements(By.xpath("//div[@class='autocomplete-results-container']/../div[2]/div"));
		int count = searchList.size();

		for (WebElement search : searchList) {
			System.out.println(search.getText());
			
		}
		
		String iphne14 = "iphone 14 plus";
		for(int i=0; i<count; i++) {
			String name = searchList.get(i).getText();
			if (name.equals(iphne14)) {
				driver.findElement(By.xpath("//div[@aria-label='iphone 14 plus']")).click();
				break;
			}
		}
		
		Thread.sleep(10000);
		List<WebElement> iphonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for( WebElement price : iphonePrice) {
			System.out.println(price.getText()
					);
		}
	}

}
