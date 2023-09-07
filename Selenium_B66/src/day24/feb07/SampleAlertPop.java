package day24.feb07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class PopUp{
	
	WebDriver driver;
	
	final String element_ID="A1";
	@FindBy(id=element_ID)
	private WebElement submit;
	
	PopUp(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	void clickSubmitBTN() {
		submit.click();
	}
	
	void printAlertMsg() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	
}

public class SampleAlertPop {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html?");
		PopUp p = new PopUp(driver);
		p.clickSubmitBTN();
		p.printAlertMsg();
		driver.quit();
		
	}

}
