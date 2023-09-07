package day16.jan28;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample14.html");
		
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<allCheckBox.size(); i++) {
			allCheckBox.get(i).click();		
		}
		
		for(int i=allCheckBox.size()-1; i>=0; i--) {
			allCheckBox.get(i).click();
		}
		
		for(int i=0; i<allCheckBox.size(); i+=2) {
			allCheckBox.get(i).click();
		}
	}

}
