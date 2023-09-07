package day22.feb04;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//limitation no1. we can't initialize all the elements in constructor , because some of the elements
//will appear during runtime-example error message
class LoginPage3{
	//declaration->unTB,pwTB,loginBTN
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	private WebElement errMsg;
	
	//initialization:unTB,pwTB,loginBTN
	LoginPage3(WebDriver driver ){
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.id("loginButton"));
		errMsg=driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));//we get NSEE
	}
	
	//utilization
	void setUserName(String un){
		unTB.sendKeys(un);
	}
	
	void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	
	void clickLogin(){
		loginBTN.click();
	}
	
	void getErrMsg()
	{
		System.out.println(errMsg.getText());
	}
}

public class Demo7 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		LoginPage3 l=new LoginPage3(driver);
		l.setUserName("admin");
		l.setPassword("damager");
		l.clickLogin();
		l.getErrMsg();
	}
}
