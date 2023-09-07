package day22.feb04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Orange{
	
	//Declaration
	private WebElement unTB;
	private WebElement pwdTB;
	private WebElement loginBTN;
	
	//Initialization
	public Orange(WebDriver driver) {
		unTB = driver.findElement(By.xpath("//input[@name='username']"));
		pwdTB = driver.findElement(By.xpath("//input[@name='password']"));
		loginBTN = driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	//Utilization
	void setUserName(String name) {
		unTB.sendKeys(name);
	}
	
	void setPassword(String pwd) {
		pwdTB.sendKeys(pwd);
	}
	
	void clickLoginBtn() {
		loginBTN.click();
	}
}

public class SampleProgramOrange {

	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Orange orange = new Orange(driver);
		orange.setUserName("Admin");
		orange.setPassword("admin123");
		orange.clickLoginBtn();
		
	}

}
