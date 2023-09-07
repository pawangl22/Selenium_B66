package day22.feb04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class loginHRM {

	// Declaration
	private WebElement userName;
	private WebElement password;
	private WebElement loginButton;

	// Initialization
	public loginHRM(WebDriver driver) {
		userName = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));
		loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	}

	// Utilization
	void setUserName() {
		userName.sendKeys("Admin");
	}

	void setPassword() {
		password.sendKeys("admin123");
	}

	void loginButton() {
		loginButton.click();
	}

}

public class PracticeOrangeHRM {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		loginHRM login = new loginHRM(driver);
		login.setUserName();
		login.setPassword();
		login.loginButton();
	}

}