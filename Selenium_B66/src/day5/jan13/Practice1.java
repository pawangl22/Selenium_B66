package day5.jan13;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com/");
		
		Dimension winSize = driver.manage().window().getSize();
		System.out.println(winSize);
		
		Point winPosition = driver.manage().window().getPosition();
		System.out.println(winPosition);
		
		int count=0;
		for (int i = 0; i < 10; i++) {
			Point newPosition = new Point(100 + count,  100+ count);
			driver.manage().window().setPosition(newPosition);
			Thread.sleep(500);
			count=count+50;
		}
		driver.quit();
	}

}
