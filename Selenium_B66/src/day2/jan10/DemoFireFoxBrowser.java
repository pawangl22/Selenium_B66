package day2.jan10;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFoxBrowser {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Loading success");
		driver.quit();
	}

}
