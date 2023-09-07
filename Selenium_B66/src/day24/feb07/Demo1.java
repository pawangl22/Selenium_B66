package day24.feb07;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage
{
	final String element_id="A1";
	@FindBy(id=element_id)
	private WebElement submitButton;
	
	private WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	void clickSubmit()
	{
		submitButton.click();
	}
	
	void printAlertMsg()
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
public class Demo1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		LoginPage l=new LoginPage(driver);
		l.clickSubmit();
		l.printAlertMsg();
	}

}
