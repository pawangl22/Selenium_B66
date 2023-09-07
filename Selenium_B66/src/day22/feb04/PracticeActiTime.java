package day22.feb04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class loginActi {
	
	//Declaration
	private WebElement un;
	private WebElement pwd;
	private WebElement keepLogged;
	private WebElement loginBtn;

	//Initialization
	public loginActi(WebDriver driver) {
		un = driver.findElement(By.name("username"));
		pwd = driver.findElement(By.name("pwd"));
		keepLogged = driver.findElement(By.name("remember"));
		loginBtn = driver.findElement(By.id("loginButton"));
	}
	
	//Utilization
	void setUserName(String name) {
		un.sendKeys(name);
	}
	
	void setPassword(String pwd) {
		this.pwd.sendKeys(pwd);
	}
	
	void setKeepMeLogged() {
		keepLogged.click();
	}
	
	void login() {
		loginBtn.click();
	}
}

public class PracticeActiTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		loginActi actiTime = new loginActi(driver);
		actiTime.setUserName("admin1");
		actiTime.setPassword("manager2");
		actiTime.setKeepMeLogged();
		Thread.sleep(2000);
		actiTime.login();
		
		driver.navigate().refresh();
		actiTime.setUserName("admin");
		actiTime.setPassword("manager");
		actiTime.setKeepMeLogged();
		Thread.sleep(2000);
		actiTime.login();
		//driver.quit();
	}

}
