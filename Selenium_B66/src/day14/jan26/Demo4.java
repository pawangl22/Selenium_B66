package day14.jan26;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
//Scrolling
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//Scroll down
		for (int i=1; i<=5; i++)
		{
			int a=100*i;
			j.executeScript("window.scrollTo(0, "+a+")");
			Thread.sleep(1000);
		}
		//Scroll up
		for (int i=5; i>=1; i--)
		{
			int a=100*i;
			j.executeScript("window.scrollTo(0, "+a+")");
			Thread.sleep(1000);
		}

	}

}
