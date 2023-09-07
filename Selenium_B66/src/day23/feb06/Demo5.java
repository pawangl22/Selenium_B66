package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage4 {

	@FindBy(id = "username")
	private WebElement unTB;

	@FindBy(name = "pwd")
	private WebElement pwTB;

	@FindBy(id = "loginButton")
	private WebElement loginBTN;

	LoginPage4(WebDriver driver) {
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

}

public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		LoginPage4 l = new LoginPage4(driver);

		l.setUserName("");
		l.setPassword("damager");
		Thread.sleep(1000);
		l.clickLogin();

		Thread.sleep(1000);

		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();
	}
}
