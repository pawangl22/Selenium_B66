package day24.feb07;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HandlePopUp {
	WebDriver driver;

	//final String elementID="//input[@type='submit']";
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	HandlePopUp(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	void clickSubmitBTN() {
		submit.click();
	}
	
	void getAlertMsg() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		HandlePopUp pop = new HandlePopUp(driver);
		pop.clickSubmitBTN();
		pop.getAlertMsg();
		//	Reporter.log(msg, true);
		driver.quit();
		
	}

}
