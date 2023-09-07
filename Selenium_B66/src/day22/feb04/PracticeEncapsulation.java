package day22.feb04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeEncapsulation {

	//Declaration
	private WebElement pBars;
	private WebElement dMenu;

	//Initialization
	public PracticeEncapsulation(WebDriver driver) {
		pBars = driver.findElement(By.xpath("(//a[contains(text(),'Progress Bars')])[1]"));
		//dMenu = driver.findElements(By.xpath("(//a[contains(text(),'Progress')]/../ul)[1]"));
	}

	//Utilization

	public void clickPBars() {
		pBars.click();
	}
	

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		PracticeEncapsulation a = new PracticeEncapsulation(driver);
		a.pBars.click();
		
	}

}
