package day13.jan25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.id("username"));
		
		int x=unTB.getLocation().getX();
		System.out.println(x);
		
		int y=unTB.getLocation().getY();
		System.out.println(y);
		
		int h=unTB.getSize().getHeight();
		System.out.println(h);
		
		int w=unTB.getSize().getWidth();
		System.out.println(w);
		
		x=unTB.getRect().getX();
		System.out.println(x);
		
		y=unTB.getRect().getY();
		System.out.println(y);
		
		h=unTB.getRect().getHeight();
		System.out.println(h);
		
		w=unTB.getRect().getWidth();
		System.out.println(w);
		
		driver.quit();
		
	}
}
