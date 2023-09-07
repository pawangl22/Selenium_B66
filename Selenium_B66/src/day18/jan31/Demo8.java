package day18.jan31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample15.html");

		WebElement listBox = driver.findElement(By.id("A1"));
		Select select = new Select(listBox);
		select.selectByIndex(1);

		List<WebElement> a = select.getAllSelectedOptions();
		System.out.println(a.size());// 1
		System.out.println(a.get(0).getText());// Agra

		WebElement b = select.getFirstSelectedOption();
		System.out.println(b.getText());// Agra

		select.getOptions();// returns all the options as collection-List
		select.getWrappedElement();// returns all options as single element

		select.deselectAll();// it will not work- we get exception-UnsupportedOperationException

		driver.quit();

	}

}
