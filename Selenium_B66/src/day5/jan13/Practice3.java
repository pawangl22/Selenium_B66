package day5.jan13;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html");
		
		Point winPosition = driver.manage().window().getPosition();
		System.out.println(winPosition);
		
		int count = 0;
		for(int i=1; i<=10; i++) {
		Point newPosition = new Point(count +50, count+50);
		driver.manage().window().setPosition(newPosition);
		count=count+50;
		System.out.println(newPosition);		
		}

	}

}
