package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class loginAct{
	
	//Declaration
	@FindBy(name="username")
	private WebElement userName;
	
	//utilization
	void setUserName(String un) {
		userName.sendKeys(un);
	}
	
} 

public class PracticeActi1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		
		loginAct login = new loginAct();
		PageFactory.initElements(driver, login);
		login.setUserName("Pawan");

	}

}
