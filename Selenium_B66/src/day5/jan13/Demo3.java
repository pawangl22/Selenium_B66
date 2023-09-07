package day5.jan13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		driver.close();

	}

}
