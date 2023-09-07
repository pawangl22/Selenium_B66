package day14.jan26;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample9.html");
		Thread.sleep(1000);

		String code = "document.getElementById('A4').value='Pawan'"; // SendKeys
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(code);

		Thread.sleep(1000);
		//String code2 = "document.getElementById('A4').value=''"; // clear
		//j.executeScript(code2);

	}

}
