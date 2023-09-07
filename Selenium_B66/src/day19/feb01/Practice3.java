package day19.feb01;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Practice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter expected food");
		String exFood = scanner.next();
		scanner.close();
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample16.html");
		WebElement food1 = driver.findElement(By.id("A3"));
		Select select =new Select(food1);
		
		String msg = "Not found";
		int i=0;
		for( WebElement food : select.getOptions()) {
			String acFood = food.getText();
			if(exFood.equalsIgnoreCase(acFood)) {
				msg="Food found @ "+ i;
				System.out.println(msg);
				break;
			}
			i++;
		}
		
		driver.quit();
		System.out.println(msg);
		

	}

}
