package day24.feb07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class login{
	
	WebDriver driver;
	
	final String elementID="A1";
	@FindBy(id=elementID)
	private WebElement submitBtn;
	
	login(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	void clickSubmit() {
		submitBtn.click();
	}
	
	void printPopUpMSG() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
}

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		login l = new login(driver);
		l.clickSubmit();
		l.printPopUpMSG();
		

	}

}
