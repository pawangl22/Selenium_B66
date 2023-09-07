package day19.feb01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://accounts.zoho.in/signin?servicename=ZohoHome&signupurl=https://www.zoho.com/signup.html");
		driver.findElement(By.id("login_id")).sendKeys("javagalbhanu@gmail.com");
		driver.findElement(By.id("nextbtn")).click();
		WebElement pw = driver.findElement(By.id("password"));
		wait.until(ExpectedConditions.stalenessOf(pw));
		driver.findElement(By.id("password")).sendKeys("Bhanu@123");
		driver.quit();
	}

}
