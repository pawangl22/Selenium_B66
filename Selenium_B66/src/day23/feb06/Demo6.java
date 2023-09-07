package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage5 {

	@FindBy(id = "username")
	private WebElement unTB;

	@FindBy(name = "pwd")
	private WebElement pwTB;

	@FindBy(id = "loginButton")
	private WebElement loginBTN;

	@FindBy(xpath = "//span[contains(text(),'invalid')]")
	private WebElement errMsg;

	LoginPage5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	void setUserName(String un) {
		unTB.sendKeys(un);
	}

	void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}

	void clickLogin() {
		loginBTN.click();
	}

	void getErrMsg() {
		System.out.println(errMsg.getText());
	}
}

public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		LoginPage5 l = new LoginPage5(driver);
		l.setUserName("admin");
		l.setPassword("damager");
		l.clickLogin();
		Thread.sleep(1000);
		l.getErrMsg();
	}
}
