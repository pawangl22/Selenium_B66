package day4.jan12;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		URL url = new URL("https://www.facebook.com/");
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
	
		driver.navigate().to("https://www.actimind.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
