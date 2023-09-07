package practice.pawan;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		URL url = new URL("http://www.facebook.com");
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
	}

}
