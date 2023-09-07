package day22.feb04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage {
	// declaration
	private WebElement unTB;

	// initialization
	LoginPage(WebDriver driver) {
		unTB = driver.findElement(By.id("username"));
	}

	// utilization
	void setUserName() {
		unTB.sendKeys("bhanu");
	}

}

public class Demo5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l = new LoginPage(driver);
		l.setUserName();
	}
}
