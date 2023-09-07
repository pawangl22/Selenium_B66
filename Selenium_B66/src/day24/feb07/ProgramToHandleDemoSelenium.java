package day24.feb07;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import day22.feb04.PracticeEncapsulation;

public class ProgramToHandleDemoSelenium {

	// Declaration
	private WebElement pBars;
	private List<WebElement> dMenu;

	// Initialization
	public ProgramToHandleDemoSelenium(WebDriver driver) {
		pBars = driver.findElement(By.xpath("(//a[contains(text(),'Progress Bars')])[1]"));
		dMenu = driver.findElements(By.xpath("(//a[contains(text(),'Progress')]/../ul)[1]"));
	}

	// Utilization

	public void clickPBars() {
		pBars.click();
	}
	
	void getMenu() {
		for(int i=0; i<dMenu.size(); i++) {
			System.out.println(dMenu.get(i).getText());
		}
	}

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		ProgramToHandleDemoSelenium a = new ProgramToHandleDemoSelenium(driver);
		a.pBars.click();
		a.getMenu();
	}
}
