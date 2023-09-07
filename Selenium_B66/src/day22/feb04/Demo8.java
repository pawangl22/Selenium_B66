package day22.feb04;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//limitation no1. we can't initialize all the elements in constructor , because some of the elements
//will appear during runtime-example error message
class LoginPage4{
	//declaration->unTB,pwTB,loginBTN
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;

	
	//initialization:unTB,pwTB,loginBTN
	LoginPage4(WebDriver driver ){
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.id("loginButton"));
	
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
	
}

public class Demo8 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		LoginPage4 l=new LoginPage4(driver);

		l.setUserName("");//un valid
		l.setPassword("damager");//invalid
		Thread.sleep(1000);
		l.clickLogin();
		
		Thread.sleep(1000);
		
		l.setUserName("admin");//invalid
		l.setPassword("");//invalid
		l.clickLogin();
		
		
		

	}
}
