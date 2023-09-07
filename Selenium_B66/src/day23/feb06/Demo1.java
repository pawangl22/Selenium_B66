package day23.feb06;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
//byte short int long --0
//float & double 0.0
//boolean -false
//char =' '
//others--> null
//Page object model (POM)
//Annotation --->@FindBy--Find By Annotation
//in page object model we declare the element using -Find By Annotation
//@FindBy(locator="value")
//<access modifier> WebElement name;

class LoginPage
{
		//declaration
		@FindBy(id="username")
		private WebElement unTB;
		
		
		//utilization
		void setUserName()
		{
			unTB.sendKeys("bhanu");
		}
}
public class Demo1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage();
		l.setUserName();
		
	}

}
