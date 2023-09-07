package day9.jan19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("remember")).click();
		Thread.sleep(500);
		driver.findElement(By.name("remember")).click();
		Thread.sleep(500);
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Enter Time-Track";
		
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("ActiTime application is logged in"+ actualTitle);
		} else {
			System.out.println("Not Logged in");
		}

		WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		if (logoutButton.isDisplayed()) {
			System.out.println("Logout button displayed" + logoutButton);
		} else {
			System.out.println("Not displayed");
		}

	}

}
