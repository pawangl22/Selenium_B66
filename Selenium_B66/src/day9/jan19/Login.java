package day9.jan19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		Thread.sleep(5000);
		// Verify home page is displayed
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Enter Time-Track";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("Fail: Home page is not displayed");
		}

		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual URL " + actualURL);
		String expectedURL = "user";

		if (actualURL.contains(expectedURL)) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("Fail: Home page is not displayed");
		}

		boolean displayed = driver.findElement(By.xpath("//a[@id='logoutLink']")).isDisplayed();
		System.out.println("Logout link is displayed= " + displayed);
		if (displayed) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("Fail: Home page is not displayed");
		}
	}

}
