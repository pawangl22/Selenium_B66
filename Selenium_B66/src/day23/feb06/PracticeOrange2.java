package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class PracticeOrange2 {

	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement unTB;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	private WebElement errorMsg;
	
	PracticeOrange2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	void setUserName(String userName) {
		unTB.sendKeys(userName);
	}
	
	void setPassword(String password) {
		pwd.sendKeys(password);
	}
	
	void clickLoginButton() {
		loginButton.click();
	}
	
	String getErrorMsg() {
		String errMsg = errorMsg.getText();
		return errMsg;
	}
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PracticeOrange2 orangeLogin = new PracticeOrange2(driver);
		orangeLogin.setUserName("Admin1");
		orangeLogin.setPassword("admin123");
		orangeLogin.clickLoginButton();
		Reporter.log(orangeLogin.getErrorMsg(), true);
		
		orangeLogin.setUserName("Admin");
		orangeLogin.setPassword("admin123");
		orangeLogin.clickLoginButton();
		
	}

}
