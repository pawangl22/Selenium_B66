package day9.jan19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LumaPractice {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement signIn = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
		
		if(signIn.isDisplayed()) {
			System.out.println("Displayed");
			signIn.click();
				
		}else
			System.out.println("Not Displayed");
		
		driver.findElement(By.id("email")).sendKeys("roni_cost@example.com");
		driver.findElement(By.id("pass")).sendKeys("roni_cost3@example.com");
		driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]")).click();
		
		
		
	}

}
