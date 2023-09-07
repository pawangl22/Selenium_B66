package day17.jan30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SampleProgramImplicitlyWait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.edureka.co/community/902/difference-between-action-and-actions-in-selenium");
		
		WebElement bigData = driver.findElement(By.xpath("//a[contains(text(),'Post-Graduate Program in Big Data Engineering')]"));
		Actions actions = new Actions(driver);
		
		actions.scrollToElement(bigData).perform();
		bigData.click();
		

	}

}
