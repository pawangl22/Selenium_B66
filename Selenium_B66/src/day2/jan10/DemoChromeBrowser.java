package day2.jan10;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChromeBrowser {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); // open chrome browser - we should have already installed chrome browser
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Loading success");
		driver.close();
	}

}
