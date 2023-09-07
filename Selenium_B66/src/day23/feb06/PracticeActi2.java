package day23.feb06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class loginAct2{
	
	//Declaration
	@FindBy(name="username")
	private WebElement userName;
	
	//Initialization
	loginAct2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	void setUserName(String un) {
		userName.sendKeys(un);
	}
	
} 

public class PracticeActi2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		
		loginAct2 login = new loginAct2(driver);
		login.setUserName("Pawan");

	}

}
