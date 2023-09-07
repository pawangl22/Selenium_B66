package day17.jan30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleProgramCustomWait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		int i = 1;
		while (true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("Logout link is found and clicked: " + i);
				break;

			} 
			catch (Exception e) 
			{
				System.out.println("Logout link not found: " +i);
			}
			i++;
		}

		System.out.println("End");
	}

}
