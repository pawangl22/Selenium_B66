package day19.feb01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*1. we cant inspect it
 *2. below the address bar and in the middle
 *3. we cant move the popup
 *4. this created using alert function of JS-> alert popup or JS popup
 *5. we cant use findElement
 * 
 */
public class Demo9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Akshara%20Training/HTML/Sample17.html");
		driver.findElement(By.id("A1")).click();

		Alert alert = driver.switchTo().alert();

		String msg = alert.getText();
		System.out.println(msg);

		alert.dismiss();// click on cancel

//		alert.accept();//click OK
	}

}
