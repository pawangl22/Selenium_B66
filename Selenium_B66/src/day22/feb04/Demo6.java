package day22.feb04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage2 {
	// declaration
	private WebElement unTB;
	private WebElement pwd;
	private WebElement loginButton;

	// initialization
	LoginPage2(WebDriver driver) {
		unTB = driver.findElement(By.id("username"));
		pwd = driver.findElement(By.name("pwd"));
		loginButton = driver.findElement(By.id("loginButton"));
	}	

	// utilization
	void setUserName(String un) {
		unTB.sendKeys(un);
	}

	void setPassword(String password) {
		pwd.sendKeys(password);
	}
	
	void clickLoginButton() {
		loginButton.click();
	}
}

public class Demo6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage2 l = new LoginPage2(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
	}
}
