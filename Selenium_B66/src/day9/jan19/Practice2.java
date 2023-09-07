package day9.jan19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		String actLoginText = driver.findElement(By.xpath("//h5[contains(text(),'')]")).getText();
		String extLoginText = "login";

		if (actLoginText.equalsIgnoreCase(extLoginText)) {
			System.out.println("Loging txt is visible " + actLoginText);
		} else {
			System.out.println("Not visible");
		}

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		String actTitle = driver.getTitle();
		String extTitle = "0";
		
		if(actTitle.contains(extTitle)) {
			System.out.println("Loged in " +actTitle );
		}
		else
		{
			System.out.println("Not Logged in");
		}
	}

}
