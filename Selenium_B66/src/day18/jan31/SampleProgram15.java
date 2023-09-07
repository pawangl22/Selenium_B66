package day18.jan31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SampleProgram15 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("file:///D:/Akshara%20Training/HTML/Sample15.html");
		
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select = new Select(listBox);
		
		//Printing text
		List<WebElement> textList = select.getOptions();
		for( WebElement text : textList) {
			System.out.println(text.getText());
		}
		
		System.out.println("-----------------------------\n");
		//Printing reverse
		for(int i=textList.size()-1; i>=0; i-- ) {
			System.out.println(textList.get(i).getText());
		}
		
		System.out.println("-----------------------------\n");
		//Printing wrapped
		String text2 = select.getWrappedElement().getText();
		System.out.println(text2);
	}

}
