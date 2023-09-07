package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class loginActi {
	
	//Declaration
	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(name="remember")
	private WebElement keepLogged;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;

	//Initialization
	public loginActi(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
