package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class OrangeLogin{
	
	//Declaration
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdTB;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	private WebElement dashboard;
	
	//Initialization
	public OrangeLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	void setUserName(String userName){
		unTB.sendKeys(userName);
	}
	
	void setPassword(String password){
		pwdTB.sendKeys(password);
	}
	
	void clickLogin(){
		loginBTN.click();
	}
	
	void dashboard() {
		System.out.println(dashboard.getText());
	}
	
}

public class SampleOrange {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		OrangeLogin orange = new OrangeLogin(driver); {
			orange.setUserName("Admin");
			orange.setPassword("admin123");
			orange.clickLogin();
			orange.dashboard();
			driver.quit();
		}
	}

}
