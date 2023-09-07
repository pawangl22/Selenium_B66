package day9.jan19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);
		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual URL " + actualURL);
		String expectedURL = "dashboard";

		if (actualURL.contains(expectedURL)) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("Fail: Home page is not displayed");
		}

		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		boolean displayed = driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed();
		System.out.println("Logout link is displayed= " + displayed);
		if (displayed) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("Fail: Home page is not displayed");
		}
	}

}
