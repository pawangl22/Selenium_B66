package day19.feb01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A3"));
		Select select = new Select(listBox);
		
		Thread.sleep(2000);
		
		select.deselectAll();
		
		Thread.sleep(2000);
		
		int count = select.getOptions().size();
		for(int i=0; i<count; i++) {
			select.selectByIndex(i);
		}
		
		Thread.sleep(2000);
		
		for(int i=count-1; i>=0; i-- ) {
			select.deselectByIndex(i);
		}
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		WebElement listBox1 = driver.findElement(By.id("A3"));
		Select select1 = new Select(listBox1);
		wait.until(ExpectedConditions.visibilityOf(listBox1));
		String firstSelected = select1.getFirstSelectedOption().getText();
		System.out.println(firstSelected);
		
		System.out.println("------------");
		
		for(WebElement list1 : select1.getOptions()) {
			System.out.print(list1.getText());
			boolean selected = list1.isSelected();
			if(selected==true) {
				System.out.println(" Selected");
			}
			else {
				System.out.println(" Not Selected");
			}
		}
	}

}
