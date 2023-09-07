package day23.feb06;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//In POM - how do we declare element -using Find By Annotation
//in POM - how do we initialize the element--> using initElements method of PageFactory class
//How many arg and what are those - 2 WebDriver (browser) POM class Object 
class LoginPage2
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
public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage2 loginPageObj=new LoginPage2();
		//initialization
		PageFactory.initElements(driver, loginPageObj);
		loginPageObj.setUserName();
		
	}

}
