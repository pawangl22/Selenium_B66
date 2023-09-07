package day4.jan12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}

}
