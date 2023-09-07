package day4.jan12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {

	public static void testBrowser(WebDriver driver) {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	} 
	
	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		Practice1.testBrowser(driver1);
		
		WebDriver driver2 = new FirefoxDriver();
		Practice1.testBrowser(driver2);

	}

}
