package day14.jan26;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//To run JS from selenium use executeScript method of Javascriptexecutor interface
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("alert('Hi I am Pawan')");
	}

}
