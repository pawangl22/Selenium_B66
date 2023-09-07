package day22.feb04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class loginRahul{

	//Declaration
	private WebElement userName;
	private WebElement password;
	private WebElement signin;
	
	//Initialization
	public loginRahul(WebDriver driver) {
		userName = driver.findElement(By.id("username"));
		password = driver.findElement(By.id("password"));
		signin = driver.findElement(By.id("signInBtn"));
	}
	
	//Utilization
	void setUserName(String un) {
		userName.sendKeys(un);
	}
	
	void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	void clickSignin() {
		signin.click();
	}
	
}

public class PracticeRhulShetty {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		loginRahul login = new loginRahul(driver);
		login.setUserName("rahulshettyacademy");
		login.setPassword("learning");
		login.clickSignin();
		
	}

}
