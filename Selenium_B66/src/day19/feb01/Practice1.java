package day19.feb01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select = new Select(listBox);
		int count =select.getOptions().size();
		
		for(int i=0; i<count; i++) {
		System.out.println(select.getOptions().get(i).getText());
		}
		
		System.out.println("---------------");
		System.out.println(select.getWrappedElement().getText());
	
		select.selectByIndex(0);
		select.selectByVisibleText("Dinner");
		select.deselectByIndex(0);
	}

}
