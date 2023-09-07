package day4.jan12;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		driver.navigate().to("http://google.com");
		System.out.println(driver.getTitle());
		
		URL url = new URL("http://facebook.com");
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
