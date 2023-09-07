package day14.jan26;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlertPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("alert('Hi, Pawan welcome')");
	}

}
