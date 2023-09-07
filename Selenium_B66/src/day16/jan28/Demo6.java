 package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample14.html");
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allCheckBox.size();
		System.out.println(count);
		
		//Check all the checkboxes
		for( WebElement checkBox: allCheckBox) {
			checkBox.click();
		}
		
		//Uncheck all the checkboxes
		for(int i=count-1; i>=0; i--) {
			allCheckBox.get(i).click();			
		}
		
		//Check alternative checkboxes
		for(int i=0; i<count; i+=2) {
			allCheckBox.get(i).click();
		}
	}

}
