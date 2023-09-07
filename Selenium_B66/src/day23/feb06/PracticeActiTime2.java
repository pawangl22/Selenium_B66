package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class loginActi2 {
	
	//Declaration
	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(name="remember")
	private WebElement keepLogged;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;

	//Initialization
	public loginActi2(WebDriver driver) {
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
	
	void getErrMsg() {
		System.out.println(errMsg.getText());
	}
}

public class PracticeActiTime2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		loginActi2 actiTime = new loginActi2(driver);
		actiTime.setUserName("admin1");
		actiTime.setPassword("manager2");
		actiTime.setKeepMeLogged();
		actiTime.login();
		actiTime.getErrMsg();
	}

}
